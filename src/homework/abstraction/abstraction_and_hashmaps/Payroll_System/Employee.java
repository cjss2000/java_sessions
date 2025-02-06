package homework.abstraction.abstraction_and_hashmaps.Payroll_System;

public abstract class Employee {

    private String employeeId;
    private String name;
    private double baseSalary;
    private int hoursWorked;

    Employee(String employeeId, String name, double baseSalary, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
        this.hoursWorked = hoursWorked;
    }

    Employee() {
        this.employeeId = "N/A";
        this.name = "SOME DEFAULT NAME";
        this.baseSalary = 0.0;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    protected abstract double calculateSalary();

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void dispalyEmployeeinfo() {
        System.out.println(
            "Employee ID: " + this.getEmployeeId() + " Name: " + this.getName() + " Salary :" + this.calculateSalary());
    }

}
