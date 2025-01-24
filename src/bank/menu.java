package bank;

import java.util.Locale;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = scanner.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = scanner.nextInt();

        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
        System.out.printf("The loan was created on %s\n" +
                "The monthly payment is %.2f\n" +
                "The total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
        scanner.close();      
    }
}
