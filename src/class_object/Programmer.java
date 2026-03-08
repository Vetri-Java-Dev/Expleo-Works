package class_object;

public class Programmer extends ProjectLead {
	
	String empName;
	int empId;
	
	void setData(int id,String name) {
		empName=name;
		empId=id;
	}
	
	void display() {
		System.out.println("Programmer Id : "+empId);
		System.out.println("Programmer Name : "+empName);
		super.display();
	}
	
	public static void main(String[] args) {
		Programmer programmer=new Programmer();
		
		programmer.setData(101, "Vetri");
	
		programmer.display();
 }
}
