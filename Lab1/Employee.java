package Lab1;

public class Employee {
    public static int employeeCount = 0;
    static final double defaultBonusPercent = 10;
    public double salary;
    public double bonusPercent;
    public double bonusValue;

    public Employee(double salary) {
        this.salary = salary;
        this.bonusPercent = defaultBonusPercent;
        this.bonusValue = EmployeeCalculator.calculateBonus(salary, bonusPercent);
        employeeCount++;
    }

    public Employee(double salary, double percentage) {
        this.salary = salary;
        this.bonusPercent = percentage;
        this.bonusValue = EmployeeCalculator.calculateBonus(salary, bonusPercent);
        employeeCount++;
    }

}
