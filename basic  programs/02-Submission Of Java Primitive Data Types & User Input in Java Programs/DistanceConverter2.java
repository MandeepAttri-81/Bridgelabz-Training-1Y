import java.util.Scanner;

public class DistanceConverter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter the distance in feet: ");
        double distanceFeet = input.nextDouble();

     
        double distanceYards = distanceFeet / 3;

       
        double distanceMiles = distanceYards / 1760;

       
        System.out.println(
            "The distance in yards is " + String.format("%.2f", distanceYards) +
            " while the distance in miles is " + String.format("%.4f", distanceMiles)
        );

        input.close();
    }
}
