/*A retail store maintains a list of product IDs in an array. Sometimes,
due to system glitches,the same product ID is recorded multiple times.
Write a Java program to count how many product IDs are repeated
(appear more than once).
Example Input:
int[] productIds = 
Expected Output:
2 product IDs are repeated. */

import java.util.Scanner;

public class retail {
     public static void main(String[] args) {
          int [] arr={101, 102, 103, 101, 104, 105, 102,};
          int count=0;
          for(int i=0;i<arr.length;i++){
               
               for(int j=0;j<i;j++){
                     if(arr[i]==arr[j])count++;
               }
          }
          System.out.println(count+": product IDs are repeated.");
     }
}
