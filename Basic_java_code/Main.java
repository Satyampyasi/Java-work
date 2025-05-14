import java.util.Scanner;

public class Main {

     public static String convert(String store){
           String arr[] = store.split(" ");
           for(int i=0;i<arr.length;i++){
               if(Character.isUpperCase(arr[i].charAt(0))){
                 System.out.println(Character.toLowerCase(arr[i].charAt(0)));
               }
              else System.out.println(Character.toUpperCase(arr[i].charAt(0)));
 
           }
          return "satya" ;
     }
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          String store = sc.nextLine();
          convert(store);
     }
 }