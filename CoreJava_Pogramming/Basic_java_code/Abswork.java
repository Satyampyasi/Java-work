import java.util.Scanner;


public class Abswork {
     void findDiff(int a ,int b){
        if(a>b)System.out.println("Diffrence is "+(a-b));
        else System.out.println("Diffrence ="+(b-a));
     }
     public static void main(String[] args) {
          Abswork f1 = new Abswork();
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          f1.findDiff(a,b);
     }
}
