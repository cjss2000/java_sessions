package homework.abstraction.abstraction_and_hashmaps.Payroll_System;

public abstract class Employee {

    private String employeeId;
    private String name;
    private double baseSalary;


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

    Employee(String employeeId, String name, double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    Employee(){};

    abstract double calculateSalary();

    public void dispalyEmployeeinfo(){
        System.out.println("This will print out employee ID, Name, and Salary");
    }

}
