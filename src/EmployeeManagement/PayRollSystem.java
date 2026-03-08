package EmployeeManagement;

import java.util.Scanner;

public class PayRollSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n====== Payroll Management System ======");
            System.out.println("1. Permanent Employee");
            System.out.println("2. Contract Employee");
            System.out.println("3. Intern");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            String empId,empName;
            double baseSalary;

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    empId=sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName=sc.nextLine();

                    System.out.print("Enter Base Salary: ");
                    baseSalary=sc.nextDouble();

                    System.out.print("Enter Bonus: ");
                    double bonus=sc.nextDouble();

                    Employee emp1=new PermanentEmployee(empId, empName, baseSalary, bonus);

                    System.out.println("\n---- Permanent Employee Details ----");
                    System.out.println(emp1);
                    
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    empId = sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName = sc.nextLine();

                    System.out.print("Enter Base Salary: ");
                    baseSalary = sc.nextDouble();

                    System.out.print("Enter Tax Rate (example 0.10): ");
                    double taxRate = sc.nextDouble();

                    System.out.print("Enter Service Charge: ");
                    double serviceCharge = sc.nextDouble();

                    Employee emp2 = new ContractEmployee(empId, empName, baseSalary, taxRate, serviceCharge);

                    System.out.println("\n---- Contract Employee Details ----");
                    System.out.println(emp2);
                    break;

                case 3:
                    System.out.print("Enter Employee ID: ");
                    empId = sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    empName = sc.nextLine();

                    System.out.print("Enter Stipend: ");
                    double stipend = sc.nextDouble();

                    Employee emp3 = new Intern(empId, empName, stipend);

                    System.out.println("\n---- Intern Details ----");
                    System.out.println(emp3);
                    break;

                case 4:
                    System.out.println("Exiting Payroll System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}