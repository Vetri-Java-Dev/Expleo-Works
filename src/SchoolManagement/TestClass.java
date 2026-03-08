package SchoolManagement;

public class TestClass {
	public static void main(String[] args) {
		System.out.println("Student Details : ");
		
		Student student=new Student("Vetri","Salem","Java",2026,3000.0);
		
		System.out.println(student);
		
		System.out.println("Staff Details : ");
		
		Staff staff=new Staff("Chithra", "Coimb", "KIOT", 100000.0);
		
		System.out.println(staff);
	}
}
