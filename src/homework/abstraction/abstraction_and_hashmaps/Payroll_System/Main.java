package homework.abstraction.abstraction_and_hashmaps.Payroll_System;

public class Main {

    public static void main(String[] args) {

        HourlyEmployee Steve = new HourlyEmployee("E001", "Steve", 0, 45, 20.00);
        SalariedEmployee Tony = new SalariedEmployee("E002", "Tony", 2500.00, 0, 1500.00);
        Tony.calculateSalary();
        Tony.dispalyEmployeeinfo();
        Steve.dispalyEmployeeinfo();
    }
}
