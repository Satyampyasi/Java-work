public class Car {
     //  Static String brand = "BMW";
     float speed;
     int time;

     static  void finddistance(Car c){
         float distance = c.speed*c.time;
         System.out.println("Toatl  Distance cover by"+ distance);


     }
     public static void main(String[] args) {
          Car c1 = new Car();
          Car c2 = new Car();

          c1.speed=85;
          c1.time=2;


          c2.speed=65;
          c2.time=3;
       finddistance(c1);
       finddistance( c2);


     }
}
