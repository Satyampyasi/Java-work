package certificate_coding;

import java.util.Scanner;

class MovieTicket {
    private int movieId;
    private int noOfSeats;
    private double costPerTicket;

    public MovieTicket(int movieId, int noOfSeats) {
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;
    }

 	public double  calculateTotalAmount() {
		if( movieId==111) {
			costPerTicket=7.0;
			double amt= (costPerTicket*noOfSeats)+((costPerTicket*noOfSeats)*0.02);
			return Math.round(amt);
		}
		else if(movieId==112) {
			costPerTicket=8.0;
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

    // Getters and setters
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public double getCostPerTicket() {
        return costPerTicket;
    }

    public void setCostPerTicket(double costPerTicket) {
        this.costPerTicket = costPerTicket;
    }
}

public class Tester2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.println("Enter Movie ID (111, 112, 113):");
        int movieId = scanner.nextInt();
        
        System.out.println("Enter Number of Seats:");
        int noOfSeats = scanner.nextInt();
        
        scanner.close();

        // Create ticket and calculate amount
        MovieTicket ticket = new MovieTicket(movieId, noOfSeats);
        double amount = ticket.calculateTotalAmount();
        
        // Display result
        if (amount == 0) {
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        } else {
            System.out.println("Total amount for booking : $" + amount);
        }
    }
}