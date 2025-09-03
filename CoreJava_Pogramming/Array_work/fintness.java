/* Q4) A fitness tracking app stores the number of steps taken by a user over
10 days. The app wants to show the user their total step count and average
daily steps.
Requirement:
Write a Java program that stores the number of steps for 10 days in an array,
calculates the total steps and average steps per day, and displays the result. */

import java.util.Scanner;

public class fintness {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int arr [] = new int [5];
          for(int i = 0;i<arr.length;i++){
               System.out.print(" Enter step cover at day "+(i+1)+": ");
               arr[i] = sc.nextInt();
          }
          int totalstep=0;
          for(int i = 0;i<arr.length;i++){
            totalstep+=arr[i];
          }
          System.out.println("Total step cover in 5 day: "+totalstep);
          System.out.println("Average step cover daily is: "+totalstep/5.0);
          sc.close();
     }
}
