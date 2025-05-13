 import java.util.Scanner;

abstract class Application {
    String brand;
    int power;
    
    public Application(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }
    
    public void turnOn() {
        System.out.println(brand + " appliance is now ON");
    }
    
    public void turnOff() {
        System.out.println(brand + " appliance is now OFF");
    }
    
    public abstract void calculateEnergyConsumption(int hours);
}

class WashingMachine extends Application {
    WashingMachine(String brand, int power) {
        super(brand, power);
    }

    public void calculateEnergyConsumption(int hours) {
        turnOn();
        turnOff();
        System.out.println("Energy use: " + (power * hours / 1000.0) + " kw"); 
    }
}

class Refrigerator extends Application {
    Refrigerator(String brand, int power) {
        super(brand, power);
    }
    
    public void calculateEnergyConsumption(int hours) {
        turnOn();
        System.out.println("Energy use: " + (power * hours / 1000.0) + " kw"); 
        turnOff();
    }
}

class Microwave extends Application {
    Microwave(String brand, int power) {
        super(brand, power);
    }
    
    public void calculateEnergyConsumption(int hours) {
        turnOn();
        turnOff();
        System.out.println("Energy use: " + (power * hours / 1000.0) + " kw"); 
    }
}

public class Mainwork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        if (choice == 1) {
            WashingMachine w1 = new WashingMachine("LG", 500);
            w1.calculateEnergyConsumption(2);
        }
        else if (choice == 2) {
            Refrigerator r1 = new Refrigerator("Samsung", 150);
            r1.calculateEnergyConsumption(24);
        }
        else if (choice == 3) {
            Microwave m1 = new Microwave("Panasonic", 1000);
            m1.calculateEnergyConsumption(1);
        }
        else {
            System.out.println("Invalid input");
        }
        
        sc.close();
    }
}