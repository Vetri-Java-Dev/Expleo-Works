package EmployeeManagement;

public class Employee {


	protected String empId;
	protected String empName;
	protected double baseSalary;


	public Employee(String empId, String empName, double baseSalary) {
		this.empId = empId;
		this.empName = empName;
		this.baseSalary = baseSalary;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public double calculateSalary() {
		return baseSalary;
	}

	@Override
	public String toString() {
		return "Employee ID: " + empId +
				"\nEmployee Name: " + empName +
				"\nFinal Salary: " + calculateSalary();
	}
}
