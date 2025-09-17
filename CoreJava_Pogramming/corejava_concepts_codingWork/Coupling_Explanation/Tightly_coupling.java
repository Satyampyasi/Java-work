package Coupling_Explanation;
// Tight coupling means when one class directly dependent on another class and if the dependent class change you have to change the class 
//that use it 
public class Tightly_coupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogi dog = new Dogi();
		dog.makesound();

	}

}

class Dogi{
	public void makesound() {
		System.out.println(" bark");
	}
}
// so in tightly coupling there is a problem if there is new animal came so  again we have to modify our dog to cat etc;