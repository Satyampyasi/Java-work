import java.util.Scanner;

class Ride {
     private String carName;
     private String destination;
     private int Cartype;
     private int totPassenger;
   public  Ride(){}

     public Ride(String destination) {
          this.destination = destination;
     }

    public Ride(String destination, int Cartype) {
          this.destination = destination;
          this.Cartype = Cartype;
     }

     public Ride(String destination, int Cartype, int totPassenger,String name) {
          this.destination = destination;
          this.Cartype = Cartype;
          this.totPassenger = totPassenger;
          this.carName=name;
     }

     public void setCarname(String name) {
          this.carName = name;
     }
     public String getCarname() {
          return carName;
     }
     public void setCartype1(int Cartype) {
          this.Cartype = Cartype;
     }

     public int getcartype1() {
          return Cartype;
     }

     public void setdestination(String destination) {
          this.destination = destination;
     }

     public String getdestination() {
          return destination;
     }

     public void settotPassenger(int totPassenger) {
          this.totPassenger = totPassenger;
     }

     public int getTotpassenger() {
          return totPassenger;
     }

     public  int  claculateFare() {
          if(Cartype==1) return 20*totPassenger; 
          else if(Cartype==2)    return 30*totPassenger;
          else return 40*totPassenger;
     }

     public String getRideSummary() {
           return "Total fare: "+claculateFare()+"\nTotal pasenger: "+totPassenger+"\nDestination: "+destination;
     }
}

public class Racing {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String name=sc.nextLine();
          String  dest = sc.nextLine();
          int type  = sc.nextInt();
          int totpas = sc.nextInt();
          sc.nextLine();
          Ride  f1 = new Ride(dest,type,totpas,name);
          System.out.println(f1.getCarname());
          System.out.println(f1.getRideSummary()); 
          System.out.println("Enter update Car Name Agaain:");
          name = sc.nextLine();
          System.out.println("Enter update car type");
          type  = sc.nextInt();
          
          f1.setCartype1(type);
          f1.setCarname(name);
          System.out.println(f1.getCarname());
          System.out.println(f1.getRideSummary()); 
          
     }
}
