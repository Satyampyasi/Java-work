import java.util.Scanner;

public class Temprature {
      static String Temprature( double temp){
          return temp < 15 ? "Cold" : ((temp > 15 && temp < 30) ? "Moderate" : "Hot");
      }
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
            double temp = sc.nextDouble();
            System.out.println(Temprature(temp));
      }
}
