
class gun{
     int noOfBullet;
     String name;
     gun(String name ,int noOfBullet){
           this.noOfBullet = noOfBullet;
           this.name= name;
      System.out.println("Name of gun: "+name+"\nNo of bullet: "+noOfBullet);
      System.out.println();
     }
     
}

public class wepon_tester {
     public static void main(String[] args) {
          gun f1 = new gun("Ak-45", 8);
          gun f2 = new gun("Sr-rifel", 6);
          gun f3 = new gun("MM", 3);
     }

}

