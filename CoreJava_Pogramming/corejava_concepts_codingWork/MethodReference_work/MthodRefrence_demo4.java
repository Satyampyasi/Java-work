package MethodReference_work;

import java.util.function.Consumer;

class foo{
	public static void printData(String message) {
		System.out.println(message+" All the best");
	}
}


public class MthodRefrence_demo4 {
	public static void main(String[] args) {
		Consumer<String> cons = foo::printData;
		
		Consumer<String> cons1 = msg->foo.printData(msg);
		
		cons1.accept(" Arun");
		cons.accept(" satyam");
	}

}
