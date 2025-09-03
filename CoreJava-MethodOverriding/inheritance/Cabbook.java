import java.util.Scanner;
class User{
 
String name;
String phoneNumber;
String email;
User(){
     this.name="Unknow";
     this.phoneNumber="Unknow";
     this.email="Unknow";
}
 public User(String name,String phoneNumber,String email ){
    this.name=name;
    this.phoneNumber=phoneNumber;
    this.email=email;
 }
 public  void displayUserInfo(){
  System.out.println("Name: "+name+"\nPhone: "+phoneNumber+"\nEmail: "+email);
 }
 public void setName(String name){
   if( name.equals("")){
      System.out.println("Invalid name provided. ");
      this.name="Unknow";
      }
    else  this.name=name;
 }
 public void setPhoneNumber(String phoneNumber){
   if(phoneNumber.equals("")){
   System.out.println("Invalid phone number.  ");
   this.phoneNumber="Unknow";
   }
   else this.phoneNumber=phoneNumber;
 }
 public void setEmail(String email){
   this.email=email;
 }

}

class Driver extends User{
String vehicleNumber;
double rating;
Driver(){
     this.vehicleNumber="Unknown";
     this.rating=0.0;
}
Driver(String name,String phoneNumber,String email,String vehicleNumber, double rating ){
   super(name,phoneNumber,email);
   this.vehicleNumber=vehicleNumber;
   this.rating = rating;
}
public void setVehicleNumber(String vehicleNumber){
   this.vehicleNumber=vehicleNumber;
}
public void setRating(double rating){
if(rating>=0.0 && rating<= 5.0) this.rating=rating;
else System.out.println("Invalid rating. Must be between 0.0 and 5.0  ");
}
public void displayDriverInfo(){
   super.displayUserInfo();
   System.out.println("Vehicle Number: "+vehicleNumber);
   System.out.println("Rating: "+rating);
}
} 


class Rider extends User{
  String paymentMethod;
  String rideType;
  Rider(){
   this.paymentMethod="unknown";
   this.rideType="unknown";
  }
  Rider(String name,String phoneNumber,String email,String  paymentMethod, String rideType ){
   super(name,phoneNumber,email);
   this.paymentMethod=paymentMethod;
   this.rideType=rideType;
  }
  public void setPaymentMethod( String mathad){
   this.paymentMethod = mathad;
  }
  public void setRideType(String rt){
   this.rideType = rt;
  }
  public void displayRiderInfo(){
     super.displayUserInfo();
     System.out.println("Payment method: "+paymentMethod);
     System.out.println("Ride type:"+rideType);
  }
  
}

public  class Cabbook{
public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter choice:");
   int choice = sc.nextInt();
  
   switch (choice) {
     case 1:
     Driver d1 = new Driver("Amit", "9876543210", "amit@driver.com", "KA01AB1234", 4.5);
     d1.displayDriverInfo();
          break;
    case 2:
    Rider r1 = new Rider();
    r1.setName("Priya");
    r1.setPhoneNumber("9123456789");
    r1.setEmail("priya@rider.com");
    r1.setPaymentMethod("Credit Card");
    r1.setRideType("Luxury");
    r1.displayRiderInfo();
    break;
    case 3:
   
Driver d2 = new Driver();
d2.setName("");
d2.setPhoneNumber("");
d2.setEmail("driver@test.com");
d2.setVehicleNumber("MH12XY1234");
d2.setRating(6.0); 
d2.displayDriverInfo();
    break;

    case 4:
    Rider r2 = new Rider("Rohit", "9090909090", "rohit@rider.com", "UPI", "Standard");
    r2.setRideType("Premium");
    r2.displayRiderInfo();
     break;

     default:System.out.println("invalid input");
     break;
   }
  }
}