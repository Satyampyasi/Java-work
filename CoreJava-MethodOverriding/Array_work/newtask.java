import java.util.Scanner;

public class newtask {

     public static  void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter tha size of array ");
          int a = sc.nextInt();
          int arr [] = new int[a];
          for(int i = 0; i<arr.length;i++){
               System.out.println("Enter iteam sold day: "+(i+1));
               arr[i] = sc.nextInt();
          }
          int min =arr[0];
          int max =arr[0],day=0;
          for(int i = 0; i<arr.length;i++){
          if( min>arr[i]){
               min = arr[i];
               day = i+1;
          }
          if(max<arr[i]){
               max =arr[i];
          }
          }
      System.out.println("Min: sal at day "+day+" of "+min+" iteam");
      System.out.println("max is :"+max);
          sc.close();
     }

}
/*) A retail store records the number of items sold per day over a week.
Management wants to analyze on which day the least number of items were sold.
Requirement:
Write a Java program that takes the number of items sold each day for 7
days in an array and finds the minimum value among them, representing the
day with the least sales. */