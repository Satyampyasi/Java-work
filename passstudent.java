import java.util.Scanner;

public class passstudent {
     
     void checkPass(int marks, int passMark){
     if(marks>=passMark)System.out.println("pass");
     else System.out.println("fail");
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          passstudent f1 = new passstudent();
          int sub1 = sc.nextInt();
          int sub2 = sc.nextInt();
          f1.checkPass(sub1, sub2);
     }
}
