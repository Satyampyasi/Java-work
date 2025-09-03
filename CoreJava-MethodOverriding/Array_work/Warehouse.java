/*A warehouse stores the weights of all packages received in a day. When
a supervisor searches for a specific package weight, the system should
report its position in the list.
Requirement:
Write a Java program to store package weights in an array. Accept a
weight from the user and print the index location of the weight if it
exists. If not found, display an appropriate message. */

import java.util.Scanner;

public class Warehouse {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int arr[] = new int[3];
            for(int i= 0;i<arr.length;i++){
              System.out.print("Enter tha weight of package");
                arr[i]= sc.nextInt();
            }
            System.out.print("Enter weight you want to find out: ");
            int weg = sc.nextInt();
            int pos=0;
            int check=0;
            for(int i= 0;i<arr.length;i++){
                if(arr[i]==weg){
                   pos = i;
                   check=1;
                    }
            }
            if(check==1) System.out.println("we found it at index: "+pos);
             else  System.out.println(" no we dont find it");
          sc.close();
          
     }
}
