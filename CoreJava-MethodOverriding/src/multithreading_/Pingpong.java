package multithreading_;

 class Pingpongdo{
	boolean check= false;
    public synchronized void ping() throws Exception{
    	 if(!check) {
    		 wait();
    	 }
    	 else {System.out.println("Ping");
    	 check = false;
    	 notify();
    	 }
    }
    
   public synchronized void pong() throws Exception{
    	if(check) {
    		wait();
    	}
    	else {System.out.println("Pong");
    	check =true;
    	notify();
    	}
    }
}

class pingprint extends Thread{
	  Pingpongdo printit;
	  pingprint(Pingpongdo printit){
		  this.printit=printit;
	  }
	  public void run() {
		  for(int i = 1;i<=5;i++) { 
			  try {
			   printit.ping();
		   }
		   catch( Exception e) {
			   System.out.println("invalid");
		   }
		  }
		 
	  }
	  
}
class pongprint extends Thread{
	  Pingpongdo printit;
	  pongprint(Pingpongdo printit){
		  this.printit=printit;
	  }
	  public void run() {
		  for(int i =1 ;i<=5;i++) {
			  try {
				  printit.pong();
			  }
			  catch(Exception e) {
				 System.out.println("invalid ");
			  }
		  }
	  }
}

public class Pingpong{
	public static void main(String[] args) {
		Pingpongdo p1 = new Pingpongdo();
		pingprint a1 = new pingprint(p1);
		pongprint a2 = new pongprint(p1);
		a1.start();
		a2.start();
	}
	
}






