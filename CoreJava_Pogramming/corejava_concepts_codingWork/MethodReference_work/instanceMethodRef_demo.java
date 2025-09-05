package MethodReference_work;


interface Trainer{
	void getTraining(String name , int expereance);
}

public class instanceMethodRef_demo {

	public static void main(String[] args) {
		Trainer t1 = (name,exp)->System.out.println(" Name of trainer :"+name+" having expereance of "+ exp+" year");
		t1.getTraining("satyam",10);
		
		
		Trainer t2 =  new Tranerwork():: getTraining;
		t2.getTraining("Arun",8);
		
	}

}

class Tranerwork{
	public void getTraining( String name, int exp) {
		System.out.println(" Name of trainer :"+name+" having expereance of "+ exp+" year");
	}
}