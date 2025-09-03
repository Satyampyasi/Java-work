import java.util.Scanner;

public class FirstLettter {
      static String desplayfirst(String name){
          String arr[] = name.split(" ");
           for(int i = 0;i<arr.length;i++){
               if(Character.isUpperCase(arr[i].charAt(0))){
                    System.out.println((Character.toLowerCase(arr[i].charAt(0)))+" ");
               }else{
                    System.out.println((Character.toUpperCase(arr[i].charAt(0)))+" ");
               }
           
           }
           return " sayja";
      } 
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          String name = "satyam nit techno";
          desplayfirst(name);
      }
}
