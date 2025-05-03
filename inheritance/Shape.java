import java.util.Scanner;

class Circle{
     double radius;
     Circle(){
          this.radius=radius;
     }
     Circle(double radius){
          this.radius=radius;
     }
     public double getArea(){
          if(radius>0) return 3.14*radius*radius;
          else return -1;
     }
}
class Cylinder extends Circle{
     double height;
     Cylinder(){
          this.height=height;
          this.radius=radius;
     }
     Cylinder( double radius, double height){
           super(radius);
          this.height=height;
          this.radius=radius;
     }
     public double getVolume(){
          return Math.PI*radius*radius*height;
     }
} 



public class Shape {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
 
                Cylinder c = new Cylinder(5, 5);
                System.out.println("Area "+c.getArea()); 
                System.out.printf("Volume %.2f",c.getVolume());
                
  }   
}
