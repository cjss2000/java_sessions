package homework.abstraction.abstraction_and_hashmaps.Payroll_System;

public class HourlyEmployee extends Employee{

    private double hourlyWage;

    public HourlyEmployee(String employeeId, String name, double baseSalary){
        super(employeeId, name, baseSalary);
    };

    @Override
    public double calculateSalary(){
        double baseSalary = hourlyWage;
        return baseSalary;
    }//this needs to be changed to hours worked
}
