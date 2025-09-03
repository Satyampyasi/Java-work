package functionsl_programing;

public interface SIMCardinterface {
public long gettingPhoneNumber();
public void networkProvider();
public void activation();
public void dactivation();
}
class Jio implements SIMCardinterface{
	public long gettingPhoneNumber() {
		return 9770926390l;
	}
	public void networkProvider() {
		System.out.println("Jio network provider");
	}
	public void activation() {
		System.out.println(" JIO sim activate");
	}
	public void dactivation() {
		System.out.println("Jio sim deactivate");
	}
	
}
class Airtel implements SIMCardinterface{
	public long gettingPhoneNumber() {
		return 8750926390l;
	}
	public void networkProvider() {
		System.out.println("Airtel network provider");
	}
	public void activation() {
		System.out.println("  Airtel sim activate");
	}
	public void dactivation() {
		System.out.println("Airtel sim deactivate");
	}
	
}
class BSNL implements  SIMCardinterface{
	public long gettingPhoneNumber() {
		return 546285940l;
	}
	public void networkProvider() {
		System.out.println("BNSL network provider");
	}
	public void activation() {
		System.out.println("BNSL sim activate");
	}
	public void dactivation() {
		System.out.println("BNSL sim deactivate");
	}
	
}

interface MobilPhoneInterface{
 void insertingSIM(SIMCardinterface  sim);
 void removing_sim();

 void makingCall(long number);
void SendText(long number,String message);
	
}

class  mobilPhone implements MobilPhoneInterface{
	private SIMCardinterface  currentSIM;
	
public  void insertingSIM(SIMCardinterface  sim) {
		currentSIM = sim;
		sim.activation();
		System.out.println(sim.getClass().getSimpleName()+"Sim inserted");
	}

public void removing_sim() {
	if(currentSIM!= null) {
		currentSIM.dactivation();
		System.out.println(currentSIM.getClass().getSimpleName()+"Sim removed");
		currentSIM = null;
	}
}

public void makingCall(long number) {
	if(currentSIM ==null) {
		System.out.println("Error : no SIM inserted");
		   return;
	}
	System.out.println("making call to "+number+" using" +currentSIM.gettingPhoneNumber());
}
public  void SendText(long number,String message) {
	if(currentSIM ==null) {
		System.out.println("Error : no SIM inserted");
		return;
	}
	System.out.println("Sending text to "+number+" using "+currentSIM.gettingPhoneNumber());
	System.out.println("message"+message);
	
}




class Customer {
	public static void main(String[] args) {
		mobilPhone phone = new mobilPhone();
		SIMCardinterface jio = new Jio();
//		SIMCardinterface airtel = new Airtel();
//		SIMCardinterface bsnl = new BSNL();
		System.out.println("--- Test Case 1 ---");
        phone.insertingSIM(jio);
        phone.makingCall(1234567890);
        phone.SendText(1234567890, "Hello");
        phone.removing_sim();
	}
		
	}
}






