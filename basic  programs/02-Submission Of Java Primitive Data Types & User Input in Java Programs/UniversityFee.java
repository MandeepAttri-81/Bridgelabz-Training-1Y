public class UniversityFee {
    public static void main(String[] args) {
        
        double fee = 125000;           
        double discountPercent = 10;   

        
        double discount = (discountPercent / 100) * fee;  
        double discountedFee = fee - discount;            

   
        System.out.println(
            "The Discounted Amount is INR " + discount + 
            " and the Discounted Price the student has to pay is INR " + discountedFee
        );
    }
}
