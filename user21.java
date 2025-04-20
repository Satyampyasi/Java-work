import java.util.Scanner;

class ticket{
     private int nofTik;
     ticket(int nofTik){
            if(nofTik>0){
               this.nofTik = nofTik;
            }
            else System.err.println("Invalid input");
            
            System.out.println("Total no ticket booked: "+getticket());
     }
     
     public int getticket(){
          return nofTik;
     }
    
}

public class user21 {
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter no of ticket you want: ");
           int tot= sc.nextInt();
          // ticket busTicket = new ticket(sc.nextInt());
          ticket busTicket = new ticket(sc.nextInt(tot));
           
          
         
      }
}
