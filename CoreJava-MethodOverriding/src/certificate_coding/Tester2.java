package certificate_coding;

import java.util.Scanner;

class MovieTicket {
	  int movieId;
	  int noOfSeats;
	  double costPerTicket;
	  public MovieTicket(int movieId,int noOfSeats) {
		  this.movieId = movieId;
		  this.noOfSeats= noOfSeats;	  
	  }
	public double  calculateTotalAmount() {
		if( movieId==111) {
			costPerTicket=7;
			double amt= (costPerTicket*noOfSeats)+((costPerTicket*noOfSeats)*0.02);
			return Math.round(amt);
		}
		else if(movieId==112) {
			costPerTicket=8;
			double amt= costPerTicket*noOfSeats;
			return Math.round(amt);
		}
		else if( movieId==113) {
			costPerTicket=8.5;
			double amt= costPerTicket*noOfSeats;
			return Math.round(amt);
		}
		else {
			 System.out.println("Sorry! Please enter valid movie Id and number of seats");
		}
		return 0;
	}
	public int getMovieId() {
		return movieId;
	}
	public void SetMovieId(int movieId ) {
		this.movieId=movieId;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void SetNoOfseats( int noOfSeats ) {
		 this.noOfSeats= noOfSeats;
	}
	public double getCostPerTicket() {
		return costPerTicket;
	}
	public void setCostPerticket(double costPerTicket) {
		this.costPerTicket=costPerTicket;
	}
	
}


 public class Tester2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int id = ParseInt(sc.nextLine());
    	int tik = ParseInt(sc.nextLine());
    	
        MovieTicket movieTicket = new MovieTicket(id,tik);
        sc.close();
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + amount);
    }

	private static int ParseInt(String nextLine) {
		// TODO Auto-generated method stub
		return 0;
	}
}