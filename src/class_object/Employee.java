//Model for employee object with methods 

package class_object;

public class Employee {
	private int empId;
	private String empName;
	
	public Employee(){}
	
	public Employee(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
	
	//Getters
	public int getId() {return empId;}
	public String getName() {return empName;}
	
	//Setters
	public void setId(int empId) {
		this.empId=empId;
	}
	public void setName(String empName) {
		this.empName=empName;
	}
	
	
	public void markCheckIn(Attendance attendance) {
		
		if(attendance.getId()!=empId) {
			System.out.print("Invalid Employee Attendance.");
			return;
		}
		
		attendance.markCheckIn();
	}
	
	public void markCheckOut(Attendance attendance) {
		if(attendance.getId()!=empId) {
			System.out.print("Invalid Employee Attendance.");
			return;
		}
		
		attendance.markCheckOut();
	}
	
	@Override
	public String toString() {
		return "Employee id : "+empId
				+"\nEmployee name : "+empName;
	}
	
}
