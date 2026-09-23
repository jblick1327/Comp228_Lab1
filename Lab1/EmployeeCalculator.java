package Lab1;

public class EmployeeCalculator {
    static double calculateBonus(double salary, double percentage) {
        return salary * percentage / 100;
    }

    public static double calculateAverage(double[] nums) {
        double total = 0;
        for (double num : nums) {
            total += num;
        }
        return total / nums.length;
    }
}
