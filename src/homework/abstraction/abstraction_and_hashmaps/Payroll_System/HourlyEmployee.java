package homework.abstraction.abstraction_and_hashmaps.Payroll_System;

public class HourlyEmployee extends Employee {

    private double hourlyWage;

    public HourlyEmployee(String employeeId, String name, double baseSalary, int hoursWorked, double hourlyWage) {
        super(employeeId, name, baseSalary, hoursWorked);
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double calculateSalary() {
        if (getHoursWorked() > 40.0) {
            int overtime = getHoursWorked() - 40;
            return hourlyWage * 40 + (hourlyWage * 1.5 * overtime);
        }
        return hourlyWage * getHoursWorked();
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
}
