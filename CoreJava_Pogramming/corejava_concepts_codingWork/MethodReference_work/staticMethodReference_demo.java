package MethodReference_work;

import java.util.Vector;

class EvenorOdd{
	public static void isEven(int number) {
		if( number%2==0) System.out.println(number +"is a even" );
		else System.out.println(number+" is not even");
	}
}


public class staticMethodReference_demo {
public static void main(String[] args) {
	Vector<Integer> numbers = new Vector<>();
	numbers.add(12);
	numbers.add(13);
	numbers.add(95);
	numbers.add(28);
	numbers.add(45);
	numbers.add(89);
	numbers.add(100);
	numbers.add(1);
	
	numbers.forEach( num->EvenorOdd.isEven(num));
	
	numbers.forEach(EvenorOdd::isEven);
	
	
}
}
