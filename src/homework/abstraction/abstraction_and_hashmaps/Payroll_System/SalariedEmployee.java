package homework.abstraction.abstraction_and_hashmaps.Payroll_System;

public class SalariedEmployee extends Employee {

    private double fixedSalary;

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }


    public SalariedEmployee(String employeeId, String name, double baseSalary, int hoursWorked, double fixedSalary) {
        super(employeeId, name, baseSalary, 40);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        double salaryDeduction = 0.90;
        double salary = this.getBaseSalary() * salaryDeduction;
        System.out.println(this.getName() + " Has a salary of: " + salary);
        return salary;
        //return this.getFixedSalary() * salaryDeduction
        //this method doesn't look right to me, I'm returning a salary, but I'm printing out my findings before the return, should this be a void method instead?
    }

}
