import java.util.Scanner;

class vehicle{
     String make;
     String model;
     int year;
      vehicle(String make,String model,int year){
       this.make=make;
       this.model=model;
       this.year=year;
     }
     public void displaydeatil(){
          System.out.println("Make:"+make);
          System.out.println("model:"+model);
          System.out.println("year:"+year);
     }
}
class Car  extends vehicle{
 int noOfDoors;
 Car(String make, String model, int year, int noOfDoors){
         super(make, model, year);
         this.noOfDoors=noOfDoors;
 }
 @Override
 public void displaydeatil(){
     super.displaydeatil();
     System.out.println("Number of Doors:"+noOfDoors);
 }

}
class Bike extends vehicle{
     String type;
     Bike(String make, String model, int year, String type){
          super(make,model,year);
          this.type=type;
     }
     @Override
     public void displaydeatil(){
          super.displaydeatil();
          System.out.println("Type"+type);
     }
}

public class vehicles{

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
               System.out.println(" enter 1 for car 2 for bike");
               int choice = sc.nextInt();
               switch (choice) {
               case 1:
                    Car car = new Car("Audi", "Q8", 2021, 4);
                    System.out.println("Car Details:");
                    car.displaydeatil();
                         break;
               
               case 2:
                    
               Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
               System.out.println("\nBike Details:");
               bike.displaydeatil();
                         break;
               default: System.err.println("invalid choice");
               }
              
     }
}