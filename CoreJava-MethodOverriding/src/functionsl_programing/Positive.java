package functionsl_programing;

import java.util.Arrays;

@FunctionalInterface
interface  working{
	boolean checknumber(int num);
}

public class Positive {
public static void display(int arr[],working w) {
		for(int i:arr) {
			if(w.checknumber(i)) System.out.println(i);
		}
	}
public static void main(String[] args) {
	int arr[]= {8,20,30,35,95};
	System.out.println(Arrays.toString(arr));
	
//	Predicate<Integer> p = (num)->{
//		if(num%2==0) return true;
//		else return false;
//	};
	working s1 = (n)->{
		if(n>20) return true;
		else return false;
	};
	
	working s2 =(n)->{
		if(n%2==0) return true;
		else return false;
	};
	System.out.println("***************GREATER THAN 10 NUMBER********************");
			display(arr,s1);
			System.out.println("***************EVEN NUMBER********************");
			display(arr,s2);
			
//	for(int i :arr) {
//		if(p.test(i)) System.err.println("even number: "+i);
//	}
}
}
