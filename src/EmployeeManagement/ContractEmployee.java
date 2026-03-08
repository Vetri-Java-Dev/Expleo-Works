package EmployeeManagement;

class ContractEmployee extends Employee {

    private double taxRate;
    private double serviceCharge;
    
    public ContractEmployee(String empId, String empName,
                            double baseSalary, double taxRate, double serviceCharge) {
        super(empId, empName, baseSalary);
        this.taxRate = taxRate;
        this.serviceCharge = serviceCharge;
    }

    @Override
    public double calculateSalary() {
        return baseSalary - (baseSalary * taxRate) - serviceCharge;
    }
}
