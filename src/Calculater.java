package src;

import java.util.Scanner;

public   public class Calculater {

static void even( int[] arr){
     int sum=0;
               int eve=0;
               int odd =0;
         for(int i =0;i<arr.length;i++){
          
          System.out.println("This is even numbers");
                 if(arr[i]%2==0){
                 System.out.println(arr[i]);
                 eve = eve+arr[i];
                 }
         }
         System.out.println("sum of even number "+eve);
         
         for(int i =0;i<arr.length;i++){
          System.out.println("This is odd numbers");
                 if(arr[i]%2!=0){
                 System.out.println(arr[i]);
                 odd = odd+arr[i];
                 }
         }
         
         for(int i =0;i<arr.length;i++){
          int sum=0;
          System.out.println("This is a sum of all element");
                 
                         sum = sum+ arr[i];
                 }
                 System.out.println("total sum is "+sum);
         for(int i =0;i<arr.length;i++){
          int flag=0;
          System.out.println("This is prime  numbers");
                 if(isPrime(arr[i])){
                      System.out.println(arr[i]);
                 }
         }
         
         for(int i =0;i<arr.length;i++){
          System.out.println("This is positive number numbers");
                 if(arr[i]>0){
                 System.out.println(arr[i]);
                 }
         }
         
         for(int i =0;i<arr.length;i++){
          System.out.println("This is negative  numbers");
                 if(arr[i]<0){
                 System.out.println(arr[i]);
                 }
         }
         }

}


     public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter tha size of array");
           int size = sc.nextInt();
           int arr[] = new int[size];
           for(int i =0;i<size;i++){
               System.out.println("Enter array :"+i+1);
               arr[i] = sc.nextInt();
           }
               even(arr); 
     }

