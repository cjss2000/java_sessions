package homework.abstraction.abstraction_and_hashmaps.Payroll_System;

public class SalariedEmployee extends Employee {

    private double fixedSalary;

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }



    public SalariedEmployee(String employeeId, String name, double baseSalary){
    super(employeeId, name, baseSalary);
    };

    @Override
    public double calculateSalary(){
        double salaryDeduction = 0.90;
      double salary = this.getFixedSalary() * salaryDeduction;
        return salary;
        //return this.getFixedSalary() * salaryDeduction
    }

}
