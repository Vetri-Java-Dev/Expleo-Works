//class to access Attendance and Employee class

package class_object;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee employee=new Employee(102,"Vetri");
		
		Attendance attendance=new Attendance(102);
		
		attendance.markCheckIn();
		
		System.out.println(attendance);
	}
}
