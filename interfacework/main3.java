/*Scenario:
A vehicle rental application rents out different types of vehicles:
Car, Bike, and Truck. Each vehicle should display rental charges per hour.

Requirements:
- Define a Rentable interface with methods: getRentalChargePerHour() and
  getVehicleType().
- Implement this interface in Car, Bike, and Truck classes with appropriate
  rental charges.
- Create a service method calculateTotalCharge(Rentable vehicle, int hours)
  that returns total charge based on hours rented.

Test Case:
Calculate rental for 4 hours for each vehicle. */
interface Rental{
   public void  getRentalChargePerHour(int hours);
   public void   getVehicleType();
}
class car implements Rental{
     public void  getRentalChargePerHour(int hours){
              System.out.println("charge of car  =: "+(60*hours));
     }
   public void   getVehicleType(){
      System.out.println("vehicle is a Car");
   }
}
class Bike implements Rental{
     public void getRentalChargePerHour(int hours){
                  System.out.println("charge of bike =: "+(30*hours));
     }
   public void   getVehicleType(){
          System.out.println("vehicle is a Bike");
   }
}
class service{
   public static void calculateTotalCharge(Rental vehicle, int hours){
           vehicle.getRentalChargePerHour(hours);
           vehicle.getVehicleType();
     }
}
public class main3 {
     public static void main(String[] args) {
         Rental  c1 = new car();//upcasting 
         Rental  b1 = new Bike();//upcasting
        

          service.calculateTotalCharge(c1,5);
          service.calculateTotalCharge(b1,2);

     }
}
