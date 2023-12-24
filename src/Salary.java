public class Salary {
    public static void main(String[] args) {
        SalaryCalculator salary = new SalaryCalculator();
        double finalSalary = salary.finalSalary(6, 10);
        SalaryCalculator salary2 = new SalaryCalculator();
        double finalSalary2 = salary2.finalSalary(4, 21);
        SalaryCalculator salary3 = new SalaryCalculator();
        double finalSalary3 = salary3.finalSalary(0, 77);
        System.out.printf("DaysSkipped: 6, Products sold: 10, Salary: %.2f%n", finalSalary);
        System.out.printf("DaysSkipped: 4, Products sold: 21, Salary: %.2f%n", finalSalary2);
        System.out.printf("DaysSkipped: 0, Products sold: 77, Salary: %.2f%n", finalSalary3);
    }
}
