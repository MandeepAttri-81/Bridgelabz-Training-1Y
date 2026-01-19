import java.util.*;
public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = sc.nextDouble();
        double principale = sc.nextDouble();
        double time = sc.nextDouble();
        double si =(principale  * rate * time )/ 100;
        System.out.println("" +si);
        sc.close();

        
    }
    
}
