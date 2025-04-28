
class vehicle{
   void accelerator(){
     System.out.println("accelerate at 5m/s");
     }
     void applyBrake(){
     System.out.println("retardation of 10s");
     }
  
}

class ElectricCar extends vehicle{
     public void change(){
     System.out.println("charge at charging station");
     }
}

public class classTestVehicles {
     public static void main(String [] args){
           ElectricCar f1 = new ElectricCar();

          f1.accelerator();
          f1.applyBrake();
          f1.change();
     }
}
