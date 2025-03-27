/* Flipkart has annouced that there will be 500 of for all customer if there billing amaout is  more that 500 */
public class Flipkart {
     String username;
     String Password;
     String mailid;
     String Address;
     long mobileno;
     static int diwalioff = 500;
   public void login( String username,String Password ){
if(username.equals("satyam") && Password.equals("saty21")){
     System.out.println(" You are login ");
     offer(200);
}
else {
     System.err.println("Username or password Incorrect");
}
}

public static void  offer( double totalshoping){
     if(totalshoping>500)
     { System.out.println("you get discount of 500  on shopping of "+totalshoping );
     System.out.println("final amount after discount"+(totalshoping-500));}
    else{
     System.out.println("No discount applied. Shop for ₹1000+ to get ₹500 off!");
    }
}


public static void main(String[] args) {
     Flipkart  value = new Flipkart();
     value.username="satyam";
     value.Password="saty21";
     value.mailid="satyampyasi565@gmail.com";
     value.Address="bhopal";
     value.mobileno = 9770926390l;
     value.login( value.username,value.Password); // 
}
}
