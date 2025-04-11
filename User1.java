import java.util.Scanner;
 public class User{
    int mutualfriends;
    boolean isVerified;
    public static String getSuggesation( int mutualfriends ,boolean isVerified ){
    if(isVerified){
       if(mutualfriends>=10 ) return "Strong Suggestion";
       else if(mutualfriends>0 && mutualfriends<10) return  "Moderate Suggestion";
       else  return   "Low Suggestion";
     
         }
        
         else{
             return "Low Suggestion";
         }
    }

      public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      User f1 = new User();
      int mutualfriends = sc.nextInt();
      boolean isVerified = sc.nextBoolean();
      
      System.out.println("Suggestion Level: "+getSuggesation(mutualfriends,isVerified));
      
      }
}