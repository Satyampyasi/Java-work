package multithreading_;


class Numberprinter{
	boolean evenTurn = false;
	public synchronized void printEven(int number)throws  InterruptedException {
		 while(!evenTurn) {
			 wait();// wait until its even turn 
		 }
		 
		 System.out.println("Even "+number);
		 evenTurn = false;
		 notify();// notify tha odd thread
	}
	
	
	public synchronized void printOdd(int number) throws InterruptedException  {
		 while(evenTurn) {
			 wait();
		 }
		 System.out.println("Odd "+number);
		 evenTurn= true;
		 notify();// Notify tha even thread 
	} 
	
}

class EvenThread extends Thread{
	Numberprinter printer;
EvenThread(Numberprinter printer ){
	this.printer=printer;
}
@Override
 public void run() {
	 for(int i= 2 ; i<=10;i+=2) {
		 try {
			 printer.printEven(i);
		 }
		 catch( Exception e) {
			 e.printStackTrace();
		 }
		 
	 }
 }
}
  
class OddThread extends Thread{
	Numberprinter printer;
	OddThread(Numberprinter printer){
		this.printer = printer;
	}
	@Override
  public void run() {
	    for(int i = 1;i<=10;i+=2) {
	    	try {
	    		printer.printOdd(i);
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    }
  }
}


public class await_evenodd {
 public static void main(String[] args) {
	 Numberprinter printer = new Numberprinter();
	 EvenThread evenThread = new  EvenThread(printer);
	 OddThread oddThread = new OddThread(printer);
	 evenThread.start();
	 oddThread.start();
	 
	 
}
}
























