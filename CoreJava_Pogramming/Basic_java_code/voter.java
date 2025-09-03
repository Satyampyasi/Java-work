public class voter {

     boolean isEligible(int age){
          // if(age>=18){
          //      return true;//System.out.println("you are aligible for vote");
          // }
          // else{
          //     return false; //System.out.println("You are not eligible");
          // }

          return age >= 18 ? true : false;
     }

       public static void main(String[] args) {
       voter v = new voter();
      
       int age = Integer.parseInt(args[0]);  
       if(v.isEligible(age)){
       System.out.println("Eligible for voting");}
       
       else System.out.println("Not eligible to vote");
          
     }
}
