import java.util.Scanner;
class User{
    int mutualfriends;
    boolean isVerified;
    public String getSuggesation(boolean isVerified, int mutualfriends ){
       if(mutualfriends>=10 && isVerified == true)  {
       return "Strong Suggestion";
    
       }
       else if(mutualfriends>0 && mutualfriends<10){
      return  "Moderate Suggestion" ;
     
       }
       else if( mutualfriends==0 && isVerified == false){
       return   "Low Suggestion";
    
       }
      return "ok";   
         }

      public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      User f1 = new User();
    System.out.println("enter true or false ");
      f1.isVerified = sc.nextBoolean();
      System.out.println(" enter no of friend");
      f1.mutualfriends = sc.nextInt();
      
      String result = f1.getSuggesation(f1.isVerified,f1.mutualfriends);
      System.out.println(result);
      
      }
}