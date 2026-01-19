import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for base and height in inches
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = input.nextDouble();

        // Calculate area in square inches
        double areaInches = 0.5 * baseInches * heightInches;
        double areaCm = areaInches * Math.pow(2.54, 2);

        System.out.println(
            "The area of the triangle is " + String.format("%.2f", areaInches) + " square inches " +
            "and " + String.format("%.2f", areaCm) + " square centimeters"
        );

        input.close();
    }
}
