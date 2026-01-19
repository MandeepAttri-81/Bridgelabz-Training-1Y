import java.util.Scanner;

public class ProfitLossCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the Cost Price (INR): ");
        double costPrice = scanner.nextDouble();

        System.out.print("Enter the Selling Price (INR): ");
        double sellingPrice = scanner.nextDouble();

        // Calculations
        double profitOrLoss = sellingPrice - costPrice;
        double percentage = (profitOrLoss / costPrice) * 100;

        // Single print statement with multiline output
        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            (profitOrLoss >= 0 
                ? "The Profit is INR " + profitOrLoss + " and the Profit Percentage is " + String.format("%.2f", percentage)
                : "The Loss is INR " + (-profitOrLoss) + " and the Loss Percentage is " + String.format("%.2f", -percentage))
        );

        scanner.close();
    }
}
