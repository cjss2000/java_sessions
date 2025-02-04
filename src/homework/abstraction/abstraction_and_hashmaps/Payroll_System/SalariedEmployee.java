package homework.abstraction.abstraction_and_hashmaps.Payroll_System;

public class SalariedEmployee extends Employee {

    public SalariedEmployee(String employeeId, String name, double baseSalary){
    super(employeeId, name, baseSalary);
    };

    @Override
    public double calculateSalary(){
        double baseSalary = 0;
        return baseSalary;
    }

}
