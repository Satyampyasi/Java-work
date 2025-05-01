import java.util.Scanner;
class Ride{
    private String destination;
     private String carType;
     private int passengerCount;
     public Ride(String destination){
        this.destination=destination;
        this.carType="Cab";
        this.passengerCount=1;
     }
      public Ride(String destination,String carType){
        this.destination=destination;
        this.carType= carType;
        this.passengerCount=1;
     }
      public Ride(String destination,String carType,int passengerCount){
        this.destination=destination;
        this.carType=carType;
        this.passengerCount=passengerCount;
     }
     public void setcartype(String carType){
     this.carType = carType;
     }
     public String getcartype( ){ return carType;}

      public void setdestination(String destination){
      this.destination=destination;
     }
     public String getdestination( ){ return destination;}

     public void setpassenger(int passengerCount){
        this.passengerCount=passengerCount;
     }
     public int getpassenger(){ return passengerCount;}

     public double calculteFare(){
      if(getcartype().equals("Mini")) return 8*getpassenger();
      else if(getcartype().equals("Sedan")) return 10*getpassenger();
      else if( getcartype().equals("SUV")) return 12*getpassenger();
      else return 7*getpassenger();
     }
     public String getRideSummary(){
        return "Ride Summary:"+"\nDestination: "+destination+"\nCar Type: "+carType+"\nPassenger Count: "+passengerCount+"\nTotal Fare: "+calculteFare();
     } 

}
public class RideTest{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int choice = sc.nextInt();
      sc.nextLine();
      if( choice==1){
          String dest = sc.nextLine();
          Ride f1 = new Ride(dest);
          System.out.println(f1.getRideSummary());
      }
      else if(choice==2){
         
          String dest=  sc.nextLine();
          String carty= sc.nextLine();
          Ride f1 = new Ride(dest,carty);
          System.out.println(f1.getRideSummary()); 
      }
      else if(choice==3){
      
          String dest=  sc.nextLine();
          String carty= sc.nextLine();
          int totpas= sc.nextInt();
          if(totpas<0) System.out.println("passenger Count Should be positive");
          else{
               Ride f1 = new Ride(dest,carty,totpas);
               System.out.println(f1.getRideSummary());
          }
      }

      else { System.out.println("Invalid choice.");}
     
    }
}