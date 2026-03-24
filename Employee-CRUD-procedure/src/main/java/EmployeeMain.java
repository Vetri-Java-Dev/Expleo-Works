import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		EmployeeDAO employeeDAO=new EmployeeDAO();
		
		do {
			System.out.println("1.Insert Employee");
			System.out.println("2.Delete Employee");
			System.out.println("3.Update Employee");
			System.out.println("4.List all Employees");
			System.out.println("5.Search Employee by Id");
			
			System.out.print("Enter your choice : ");
			int choice=sc.nextInt();
			
			switch(choice) {
				case 1:
				
					System.out.print("Enter Employee id : ");
					int id=sc.nextInt();
					sc.nextLine();
					
					System.out.print("Enter Employee name : ");
					String name=sc.nextLine();
					
					System.out.print("Enter Department : ");
					String dept=sc.nextLine();
					
					employeeDAO.insertEmployee(new Employee(id, name, dept));
					
					break;
				case 2:
					
					System.out.print("Enter Employee id : ");
					
					employeeDAO.deleteEmployee(sc.nextInt());
					
					break;
				case 3:
					
					System.out.print("Enter Employee id : ");
					id=sc.nextInt();
					sc.nextLine();
					
					System.out.print("Enter department to update : ");
					dept=sc.nextLine();
					
					employeeDAO.updateDepartment(id, dept);
					break;
				case 4:
					employeeDAO.retrieveEmployee();
					break;
				case 5:
					System.out.print("Enter Employee id : ");
					
					employeeDAO.retrieveEmployeeById(sc.nextInt());
					
					break;
				case 6:
					return;
				default:
					System.out.println("Invalid choice try again.");
			}
		}while(true);
	}
}
