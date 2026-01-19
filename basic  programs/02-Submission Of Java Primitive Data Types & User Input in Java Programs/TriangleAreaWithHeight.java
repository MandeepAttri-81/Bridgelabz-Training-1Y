import java.util.Scanner;

public class TriangleAreaWithHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = input.nextDouble();

        double areaCm2 = 0.5 * baseCm * heightCm;


        double baseInches = baseCm / 2.54;
        double heightInches = heightCm / 2.54;

        
        double areaInches2 = 0.5 * baseInches * heightInches;


        int feet = (int)(heightInches / 12);
        double inches = heightInches % 12;
        System.out.println("The area of the triangle is " + String.format("%.2f", areaCm2) + " square centimeters " +
                           "and " + String.format("%.2f", areaInches2) + " square inches");
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + String.format("%.2f", inches));

        input.close();
    }
}
