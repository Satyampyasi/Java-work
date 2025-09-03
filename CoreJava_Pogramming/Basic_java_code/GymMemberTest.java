import java.util.Scanner;

class GymMember{
     private String name;
     private String planType;
     private  String discountCode; 
     GymMember(String name){
        this.name=name;
        this.planType="basic";
        this.discountCode="none";
      }
      GymMember(String name,String planType){
         this.name=name;
         this.planType=planType;
         this.discountCode="none";
      }
     GymMember(String name,String planType,String discountCode){
         this.name=name;
         this.planType=planType;
         this.discountCode=discountCode;
      }
      public void setName(String name){
         this.name=name;
      }
      public String getName(){ return name;}
 
       public void setplanType(String planType){
         this.planType=planType;
      }
      public String getPlantype(){ return planType;}
 
       public void setDiscountCode(String discountCode){
         this.discountCode=discountCode;
      }
      public String getDiscountCodee(){ return discountCode;}
      public double calculateMembershipFee(){
            if(getDiscountCodee().equals("disc10")){
                  if(getPlantype().equals("basic")){
                     return 1000-(1000 * 10 / 100);
                  }
                  else if(getPlantype().equals("standard")){
                     return 1500-(1500 * 10 / 100);
                  }else{
                     return 2000 -(2000 * 10 / 100);
                  }
            }
       else if(getDiscountCodee().equals("disc20")){
         if(getPlantype().equals("basic")){
            return 1000 * 20 / 100;
         }
         else if(getPlantype().equals("standard")){
            return 1500 * 20 / 100;
         }else{
            return 2000 * 20 / 100;
         }
   }else{
       if( getPlantype().equals("basic")) return 1000;
       else if(getPlantype().equals("standard")) return 1500;
       else return 2000;
      //  return getPlantype().equals("basic") ? 1000 : getPlantype().equals("standard") ? 1500 : 2000;
   }

 
      }
      public String getMemberDetails(){
         return "Member Details:"+"\nName: "+name+"\nPlan Type:"+getPlantype()+"\nDiscount Code: "+discountCode+"\nMembership Fee : "+(calculateMembershipFee());
      }
 }
 
 
 
 public class GymMemberTest{
 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int choice = Integer.parseInt(sc.nextLine());
     if( choice == 1){
          String name= sc.nextLine();
          GymMember f1 =  new GymMember( name);
          System.out.println(f1.getMemberDetails());
     }
     else if(choice ==2){
      String name= sc.nextLine();
      String planType= sc.nextLine();
     GymMember f1 =  new GymMember( name, planType);
     System.out.println(f1.getMemberDetails());
     }
     else if(choice ==3){
     String name= sc.nextLine();
     String planType= sc.nextLine();
     String discountCode= sc.nextLine();
    GymMember f1 =  new GymMember( name, planType,discountCode);
    System.out.println(f1.getMemberDetails());
     }

   
 }
 
 }