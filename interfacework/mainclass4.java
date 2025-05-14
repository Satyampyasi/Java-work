/*Scenario:
A food delivery app integrates with multiple delivery partners like Swiggy,
Zomato, and Dunzo. Each has a unique way to calculate delivery time.

Requirements:
- Create a DeliveryPartner interface with a method estimateDeliveryTime(String address).
- Implement the interface in Swiggy, Zomato, and Dunzo classes with different
  logic (e.g., constant or random delivery times).
- Create a method printDeliveryEstimate(DeliveryPartner partner, String address). */
interface DeliveryPartner{
    public void estimateDeliveryTime(String address);
}
class Swiggy implements DeliveryPartner{
   public  void estimateDeliveryTime(String address){
      System.out.println("iteam will be Drlivery at: "+address);
     }
}

class Zomato implements DeliveryPartner{
   public  void estimateDeliveryTime(String address){
      System.out.println("iteam will be Drlivery at: "+address);
     }
}

class Dunzo implements DeliveryPartner{
   public  void estimateDeliveryTime(String address){
      System.out.println("iteam will be Drlivery at: "+address);
     }
}
class apply {
  public static void printDeliveryEstimate(DeliveryPartner partner, String address){
  partner.estimateDeliveryTime(address);
  }
}


public class mainclass4 {
     public static void main(String[] args){
       DeliveryPartner s1 = new Swiggy();
       DeliveryPartner z1 = new Zomato();
       DeliveryPartner d1 = new Dunzo();
       
       apply.printDeliveryEstimate(s1,"hatta");
       apply.printDeliveryEstimate(d1, "damoh");
       apply.printDeliveryEstimate(z1,"hyd");
       

     }
}
