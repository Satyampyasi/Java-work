package overriding;

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

