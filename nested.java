import java.util.Scanner;

public class nested {
     public static void main(String[] args) {
         Scanner check = new Scanner(System.in);
         System.out.println("Enter A your age"); 
         int A = check.nextInt();

         System.out.println("Enter b your age"); 
         int B = check.nextInt();

         System.out.println("Enter C your age"); 
         int C = check.nextInt();
         if(A>B){
            if(A>C){
                System.out.println("A is biggest "+A);
            }
            else{
                System.out.println("C is biggest"+C);
            }
         }
         else{
            if(B>C){
                System.out.println("B is biggest"+B);
            }
            else{
                System.out.println("C is biggest"+C);
            }
         }
     }
   
}
