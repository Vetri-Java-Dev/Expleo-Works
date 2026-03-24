
public class Employee {
	private int e_id;
	private String e_name;
	private String dept;
	
	
	
	public Employee(int e_id, String e_name, String dept) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.dept = dept;
	}
	
	public int getE_id() {
		return e_id;
	}
	
	public String getE_name() {
		return e_name;
	}

	public String getDept() {
		return dept;
	}
	
	
}
