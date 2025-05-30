package overriding;
<<<<<<< HEAD

class EEngine {
    public void start() {
        System.out.println("Engine started");
    }
    
    public void stop() {
        System.out.println("Engine stopped");
    }
}

class Bike {
//    private Engine engine;  // Composition 
//    
//    public Bike(Engine engine) {
//        this.engine = engine;
//    }
	private EEngine engine;
     Bike(){
    	 this.engine = new EEngine();  
//    	 Aggregation
     }
    
    public void startBike() {
        engine.start();
        System.out.println("Bike started");
    }
    
    public void stopBike() {
        engine.stop();
        System.out.println("Bike stopped");
    }
}

public class vehicles {
    public static void main(String[] args) {
//        Engine engine = new Engine();
        Bike myBike = new Bike();
        
        myBike.startBike();
        myBike.stopBike();   
    }
}

=======
class Engine{
	
}

class bike {
	private Engine engine;
	bike(Engine engine){
		this.engine=engine;
	}
	public void bikeStart() {
		System.out.println("bike start");
	}
	public void bikestop() {
		System.out.println("bike start");
	}
  
}
class mainclass{
	public static void main(String[] args){
		Engine e1 = new Engine();
		bike b1 = new bike(e1);
	}
}
>>>>>>> 3324efa614b97ac30abbf394884b0b0bc21bee1e
