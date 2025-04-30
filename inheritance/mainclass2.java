class Vehicle{
     String brand;
     int year;
     Vehicle(String brand,int year){
          this.brand=brand;
          this.year=year;
     }
}
class Car extends Vehicle{
     int regisNo;
     Car( String brand,int year,int regisNo){
        super(brand,year);
        this.regisNo=regisNo;
     }
}


public class mainclass2 {
     public static void main(String[] args){
          Car c1 = new Car("BMW",2024,74500);
          System.out.println("Car Brand:"+c1.brand);

     }
     
}
