 class CarsRental {
     private String carModel;
     private int rentalDay;
     private double dailyrate;
 public double calculateTotalcost(){
  double totalcost = rentalDay*dailyrate;
     if(rentalDay>7){
    return totalcost-totalcost*0.10;
     }
     else return totalcost;
 }
       public void  setCarModel( String carModel){
          this.carModel=carModel;
       }
       public String getCarModel()
       {
          return carModel;
       }

       public void SetRentalDy(int rentalDay){
          this.rentalDay = rentalDay;
       }
       public int getRentalDay() {return rentalDay;}



       public void SetDailyret( int dailyrate){
       this.dailyrate = dailyrate;
       }
       public double getDailyret(){
          return dailyrate;
       }

      }
public class ImpWork{

     public static void main(String[] args){
          CarsRental f1 = new CarsRental();
           f1.SetRentalDy(45);
           f1.setCarModel("BMW");
           f1.SetDailyret(8);

           System.out.println("Total cost is "+f1.calculateTotalcost());
           System.out.println("Car model is :"+f1.getCarModel());
           System.out.println("Daily rate is "+f1.getDailyret());
           System.out.println("Rental day is :"+f1.getRentalDay());


     }
}