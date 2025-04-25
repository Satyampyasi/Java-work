import java.util.Scanner;

class Ride {
     private String carName;
     private String destination;
     private String Cartype;
     private int totPassenger;
   public  Ride(){}

     public Ride(String destination) {
          this.destination = destination;
     }

    public Ride(String destination, String Cartype) {
          this.destination = destination;
          this.Cartype = Cartype;
     }

     public Ride(String destination, String Cartype, int totPassenger,String name) {
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
     public void setCartype1(String Cartype) {
          this.Cartype = Cartype;
     }

     public String getcartype1() {
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

     public  String claculateFare() {
          if(Cartype.equals("bike")) return  "Total "+20*totPassenger; 
          else if(Cartype.equals("car"))    return "Total "+30*totPassenger;
          else if( Cartype.equals("bus")) return "Total "+40*totPassenger;
          else return "invalid car type";
     
     }

     public String getRideSummary() {
           return "Total fare: "+claculateFare()+"\nTotal pasenger: "+totPassenger+"\nDestination: "+destination;
     }
}

public class Racing {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("car name");
          String name=sc.nextLine();
          System.out.println("car destination");
          String  dest = sc.nextLine();
          System.out.println("car type bus,bike,car");
          String type  = sc.nextLine();
          System.out.println("tot pasenger:"); 
          int totpas = sc.nextInt();
          sc.nextLine();
          Ride  f1 = new Ride(dest,type,totpas,name);
          System.out.println(f1.getCarname());
          System.out.println(f1.getRideSummary()); 

          System.out.println("Enter update Car Name Agaain:");
          name = sc.nextLine();
          f1.setCarname(name);

          System.out.println("Enter update car type");
          type  = sc.nextLine();
          f1.setCartype1(type);
         
          System.out.println(f1.getCarname());
          System.out.println(f1.getRideSummary()); 
          
     }
}
