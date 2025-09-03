import java.util.Scanner;

public class Frenhite {
     public static void main(String[] args) {
          System.out.println("Enter 1 for F to C   or 2 for C TO F");
          Scanner sc =  new Scanner(System.in);
          int chose = sc.nextInt();
         

          if(chose ==1){
               System.out.println("Enter your ferenhite tem ");
               float temp1 = sc.nextFloat(); // 55.5
               float cel  = ((temp1-32)*5/9);// 55.5 -32*0
               System.out.println(temp1+" ferehite is equal to"+cel);
                

          }
            else if(chose ==2){
                 System.out.println("Enter your celsious tem");
                 float temp2 = sc.nextFloat();
                 float fer = (temp2*9/5)+32;
                System.out.println(temp2+" celsious is equal to"+fer);
            }
          else {
               System.out.println("Enter right chose");
          }


     }
}
