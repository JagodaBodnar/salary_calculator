public class SalaryCalculator {
    private final double BASE_SALARY = 1000.00;
    private final double MAX_SALARY = 2000.00;
    private final double SALARY_MULTIPLIER = 1.0;
    private final double SALARY_MULTIPLIER_REDUCTED = .85;
    private final int MAX_ABSENT_DAYS = 5;
    private final int BONUS_MULTIPLIER = 10;
    private final int BONUS_MULTIPLIER_THRESHOLD = 13;
    private final int PRODUCT_SOLD_THRESHOLD = 20;

    public double salaryMultiplier(int daysSkipped) {
        if (daysSkipped >= MAX_ABSENT_DAYS) {
            return SALARY_MULTIPLIER_REDUCTED;
        }
        return SALARY_MULTIPLIER;
    }

    public int bonusMultiplier(int productsSold) {
        if (productsSold >= PRODUCT_SOLD_THRESHOLD) {
            return BONUS_MULTIPLIER_THRESHOLD;
        }
        return BONUS_MULTIPLIER;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double finalSalary = bonusForProductsSold(productsSold) + BASE_SALARY * salaryMultiplier(daysSkipped);
        if (finalSalary > MAX_SALARY) {
            return MAX_SALARY;
        }
        return finalSalary;
    }
}
