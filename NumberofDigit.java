
import java.util.Scanner;
class NumberofDigit{

public static void main(String[] args){
Scanner value = new Scanner(System.in);

System.out.println("Enter tha value of number");
int number = value.nextInt();
int flag = 0;
 do{
  number = number/10;
  flag++;
}
while(number!=0);

System.out.println("Total digit in a number is " +flag);

}

}