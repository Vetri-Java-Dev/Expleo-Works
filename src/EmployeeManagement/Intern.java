package EmployeeManagement;

class Intern extends Employee {

    private double stipend;

    public Intern(String empId, String empName, double stipend) {
        super(empId, empName, 0); 
        this.stipend = stipend;
    }


    @Override
    public double calculateSalary() {
        return stipend;
    }
}
