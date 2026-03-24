import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class EmployeeDAO {
	public void insertEmployee(Employee employee) {
		
		Connection connection=null;
		
		try {
			connection=DbConnection.getConnection();
			
			CallableStatement statement=connection.prepareCall("call insert_employee(?,?,?)");
			
			statement.setInt(1,employee.getE_id());
			statement.setString(2,employee.getE_name());
			statement.setString(3,employee.getDept());
			
			statement.execute();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteEmployee(int id) {
			
			Connection connection=null;
			
			try {
				connection=DbConnection.getConnection();
				
				CallableStatement statement=connection.prepareCall("call delete_employee(?)");
				
				statement.setInt(1,id);
				
				int rowAffected=statement.executeUpdate();
				
				if(rowAffected>0)System.out.println("\nDeleted.\n");
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	public void retrieveEmployee() {
		
		Connection connection=null;
		
		try {
			connection=DbConnection.getConnection();
			
			CallableStatement statement=connection.prepareCall("call retrieve_employee");
		
			ResultSet result=statement.executeQuery();
			
			System.out.println("");
			
			while(result.next()) {
				System.out.println("Employee id : "+result.getInt(1)+" Employee name : "+result.getString(2)
				+" Department : "+result.getString(3));
				System.out.println("");
			}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateDepartment(int id,String dept) {
			
			Connection connection=null;
			
			try {
				connection=DbConnection.getConnection();
				
				CallableStatement statement=connection.prepareCall("call update_employee(?,?)");
			
				statement.setInt(1,id);
				statement.setString(2, dept);
				
				int rowAffected=statement.executeUpdate();
				
				if(rowAffected>0)System.out.println("\nUpdated.\n");
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	public void retrieveEmployeeById(int id) {

	    Connection connection = null;

	    try {
	        connection = DbConnection.getConnection();

	        CallableStatement statement = connection.prepareCall(
	            "call retrieve_employeeById(?)"
	        );

	        statement.setInt(1, id);

	        ResultSet result = statement.executeQuery();

	        if (result.next()) {
	            System.out.println(
	                "\nEmployee id : " + result.getInt(1) +
	                " Employee name : " + result.getString(2) +
	                " Department : " + result.getString(3)+"\n"
	            );
	        }
	        else {
	            System.out.println("Employee not found.");
	        }

	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
}
