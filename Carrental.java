public class Carrental {
     static int totalCar = 40;
     double car_charge;
     static double totalCarCharge = 0;
     public static void main(String[] args) {
          Carrental c1 = new Carrental();
          c1.car_charge = 4500;
          c1.rentCar();
         

          Carrental c2 = new Carrental();
          c2.car_charge = 900;
          c2.rentCar();
        
          System.out.println("avalibale car is " +totalCar);
          System.out.println("Total car charges: " + totalCarCharge);
     }
     public  void rentCar(){
      totalCar--;
     charge();
     }
     public  void  charge(){
System.out.println("Charged amount: " + this.car_charge);  
 totalCarCharge += this.car_charge;
     }
}

