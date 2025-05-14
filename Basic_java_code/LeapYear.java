public class LeapYear{
            boolean isleapyear(int year){
                if( year%400 == 0)return true;
                else if(year%100 == 0)return false;
                else if(year%4==0)return true;
                else return false;  
      }
      public static void main(String[] args) {
          int year =2024;
           LeapYear f1 = new LeapYear();
               if(f1.isleapyear(year)){

                System.out.println("Yes this =>" +year+ " is a leap year");
               }
               else{
               System.out.println("No=>" +year+" is not a leap year");

               }
      }
}
