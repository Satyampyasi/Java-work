import java.util.Scanner;

public class EmployeePay {
    public double calculateHRA(double salary) {
        return salary * 0.20;
    }
    
    public double calculateNetSal(double salary) {
        double hra = calculateHRA(salary);
        double netSalary = salary + hra;
        System.out.println("Total NET salary is " + netSalary);
        return netSalary;
    }
    
    public static void main(String[] args) {
        EmployeePay f1 = new EmployeePay();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.println("HRA is: " + f1.calculateHRA(salary));
        System.out.println("Net Salary: " + f1.calculateNetSal(salary)); 
    }
}

