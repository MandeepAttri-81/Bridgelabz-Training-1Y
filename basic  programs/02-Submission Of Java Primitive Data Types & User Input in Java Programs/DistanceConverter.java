import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceFeet = input.nextDouble();

        double distanceYards = distanceFeet / 3;

        
        double distanceMiles = distanceYards / 1760;

        
        System.out.println(
            "The distance of " + distanceFeet + " feet is equivalent to " +
            String.format("%.2f", distanceYards) + " yards and " +
            String.format("%.4f", distanceMiles) + " miles."
        );

        input.close();
    }
}
