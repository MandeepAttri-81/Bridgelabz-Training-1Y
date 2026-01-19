import java.util.Scanner;

public class PenDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the total number of pens: ");
        int totalPens = scanner.nextInt();

        System.out.print("Enter the number of students: ");
        int students = scanner.nextInt();

    
        int pensPerStudent = totalPens / students;   
        int remainingPens = totalPens % students;    

    
        System.out.println(
            "The Pen Per Student is " + pensPerStudent + 
            " and the remaining pen not distributed is " + remainingPens
        );

        scanner.close();
    }
}

