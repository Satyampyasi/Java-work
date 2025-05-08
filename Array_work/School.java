/*A school maintains a list of student roll numbers who attended a special
workshop. When a teacher wants to check if a particular student attended the
session, the system should allow them to search using the roll number.
Requirement:
Write a Java program that stores student roll numbers in an array and allows
the user to search for a specific roll number. If found, print a success
message, otherwise display "Roll number not found." */

import java.util.Scanner;

public class School {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a total student attending :");
          int size =sc.nextInt();
          int arr[] = new int[size];
          for(int i =0;i<arr.length;i++){
            System.out.print("Enter roll of studet "+(i+1)+" :");
            arr[i]=sc.nextInt();
          }
          System.out.println("Enter roll of student you want to check:");
          int key = sc.nextInt();
          int check=0;
          for(int i =0;i<arr.length;i++){
               if(key==arr[i]) check=1;
          }
          if( check==1)System.out.println("yes student is present: ");
          else System.out.println("Student are not found");

          sc.close();
     }
}
