import java.util.Scanner;
class MovieTicket{
    private String movieName;
    private String showTime;
    private int seatCount;
   public MovieTicket(String movieName){
        this.movieName=movieName;
        this.seatCount=1;
        this.showTime="morning";
    }
    //stdfhjgfysfdjk
    public MovieTicket(String movieName,int seatCount){
        this.movieName=movieName;
        this.seatCount=seatCount;
         this.showTime="morning";
    }
    public MovieTicket(String movieName,int seatCount,String showTime){
    this.movieName=movieName;
    this.seatCount=seatCount;
    this.showTime=showTime;
    }
    public String getmovieName(){ return movieName; }
    public String getshowTime(){ return showTime;}
    public int getseatCount(){ return seatCount;}
     public double  getTotalPrice(){
        if(getshowTime().equals("morning")) return 100*getseatCount();
else if(getshowTime().equals("afternoon")) return 150*getseatCount();
else if( getshowTime().equals("evening")) return 200*getseatCount();
else return 2.55;
     }
     public void displayTicketDetails(){
        System.out.println("Ticket Details:");
        System.out.println("Movie Name: "+movieName);
        System.out.println("Show Time: "+showTime);
        System.out.println("Seat Count: "+seatCount);
        System.out.println("Total Price: "+getTotalPrice());
        
     }

}
public class MovieTicketTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int choice = Integer.parseInt(nextLine());
        int choice = sc.nextInt();
        if( choice==1){
        String mov = sc.nextLine();
        MovieTicket m1 = new MovieTicket(sc.nextLine());
        System.out.println(m1.displayTicketDetails());
        }

         else if( choice==2){
        MovieTicket m1= new MovieTicket(sc.nextLine(),sc.nextInt());
       m1.displayTicketDetails();
        }

        else if( choice==3){
        MovieTicket m1= new MovieTicket(sc.nextLine(),sc.nextInt(),sc.nextLine());
        System.out.println(m1.displayTicketDetails());
        }
        else System.out.println("Invalid choice.");
        

    }
}