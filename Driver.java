import Lab1.*;

public static void main(String[] args) {
    double[] salaries = { 55000, 62000, 71000, 48000, 85000 };
    Employee[] employees = new Employee[5];

    employees[0] = new Employee(salaries[0]);
    employees[1] = new Employee(salaries[1], 15);
    employees[2] = new Employee(salaries[2], 12);
    employees[3] = new Employee(salaries[3], 16.5);
    employees[4] = new Employee(salaries[4]);

    System.out.println("Employees\n----------");
    for (Employee employee : employees) {
        System.out.printf("Salary: $%.2f. Bonus %.2f%%: $%.2f\n", employee.salary, employee.bonusPercent,
                employee.bonusValue);
    }

    System.out.println("\nNumber of employees: " + Employee.employeeCount);
    System.out.println("Average Salary: " + EmployeeCalculator.calculateAverage(salaries));

}
