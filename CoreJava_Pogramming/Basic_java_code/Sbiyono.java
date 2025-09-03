class Sbiyono {
   String userid;
   String Password;
   static String bankname = "SBI";

 public static void main(String[]args){
 System.out.println("Bank name  is :"+bankname);
 Sbiyono user1 = new Sbiyono(); // Creating object with tha help of new ;
 Sbiyono user2 = new Sbiyono();

 user1.userid ="satyam";
 user1.Password = "sat454";

 user2.userid = "Ram";
 user2.Password = "Ram108";
 System.out.println("=======================================================================================================================");
 System.out.println("Satyam user id: "+user1.userid);
 System.out.println("Satyam's Password: "+user1.Password);
 System.out.println("=======================================================================================================================");
 System.out.println("Ram user id: "+user2.userid);
 System.out.println("Ram password: "+user2.Password);
 
}

}