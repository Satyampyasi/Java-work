package Coupling_Explanation;
/* Loose coupling mean that class and object know little about  each other they are intract throw abstraction(eg interface*/

interface Animal{
	public void sound();
	
}

class jungle{
	Animal animal;
	public jungle(Animal animal) {
		this.animal=animal;
	}
    public void fight() {
    	animal.sound();
    }
	
	
}

public class Loose_coupling {

	public static void main(String[] args) {
	 Animal dog = new Dog();
	 System.out.println("****************************************************************************************");
	 Animal cat = new Cat();
	 
	 jungle j1 = new jungle(cat);
	 jungle j2 = new jungle(dog);
	 
	 j1.fight();
	 j2.fight();
	 

	}

}

class Dog implements Animal{
	public void sound() {
		System.out.println("Dog bhoww");
	}
	
}


class Cat implements Animal{
	public void sound() {
		System.out.println("cat mew");
	}
	
}