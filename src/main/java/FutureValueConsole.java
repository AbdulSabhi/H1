
import java.text.NumberFormat;
import java.util.Scanner;

/*
 * Author: Abdul Al Sabhi <asabhi@uab.edu>
 * Assignment:  h1 - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

/**
 *
 */
public class FutureValueConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Welcome to the Future Value Calculator");
         System.out.println("H1 Github");
         // get a Scanner object to scan for user input 
         Scanner sc = new Scanner(System.in);
         String choice = "y";
         while (choice.equalsIgnoreCase("y")) {
             // get input from user
             System.out.println("Enter monthly investment:   ");
             double monthlyInvestment = sc.nextDouble();
             
             System.out.println("Enter yearly interest rate: ");
             double interestRate = sc.nextDouble();
             
             System.out.println("Enter number of years:      ");
             int years = sc.nextInt();
             
             // convert all input values to months
             double monthlyInterestRate = interestRate / 12 / 100;
             int months = years * 12;
             
             // call method to calculate future value
             double futureValue = calculateFutureValue(
                      monthlyInvestment, monthlyInterestRate, months);
             
             // format and display the result
             NumberFormat currency = NumberFormat.getCurrencyInstance();
             System.out.println("Future value:               "
                     + currency.format(futureValue) + "\n");
             
             // see if the user wants to continue
             System.out.println("Continue? (y/n): ");
             choice = sc.next();
             System.out.println();
         }
    }

    private static double calculateFutureValue(double monthlyInvestment, double monthlyInterestRate, int months) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
