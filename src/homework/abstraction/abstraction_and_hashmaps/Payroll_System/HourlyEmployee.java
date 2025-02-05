package homework.abstraction.abstraction_and_hashmaps.Payroll_System;

public class HourlyEmployee extends Employee{

    private double hourlyWage;


    public HourlyEmployee(String employeeId, String name, double baseSalary){
        super(employeeId, name, baseSalary);
    };

//    @Override
//    public double calculateSalary(double hoursWorked){
//        double baseSalary = hourlyWage * hoursWorked;
//        return baseSalary;
//    }
    @Override
    public double calculateSalary(){
      //  double baseSalary = hourlyWage * baseSalary;
        return this.getBaseSalary() * hourlyWage;
    }
    public double salaryCalculator(double hoursWorked){
       double totalSalary = hourlyWage * hoursWorked;
        if (hoursWorked > 40.0){
         double OTtotalSalary = hoursWorked * (hourlyWage*1.5);
            return OTtotalSalary;
        } else
       return totalSalary;
    }
}
