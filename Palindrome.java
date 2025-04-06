import java.util.Scanner;

public class Palindrome {
         static String isPalindrome( String name){
          boolean Palindrome = true;
            String name1 = name.toLowerCase();
          for(int i=0; i<name1.length();i++){
               if(name1.charAt(i)!= name1.charAt(name1.length() - i-1)){
                    Palindrome = false;
                    break;
               }
          }
         
           return Palindrome ?" palindrome" : "not palindrome";
      }
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in); 
          System.out.print("Enter your name: ");
          String name = sc.nextLine(); 

          System.out.println(isPalindrome(name));
      }
}
