package overriding;
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
