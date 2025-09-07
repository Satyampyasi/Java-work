package Stream_API;
import java.util.stream.*;

import java.util.Arrays;

public class Array_class_method {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40};
		IntStream stream1 = Arrays.stream(arr);
		stream1.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------");
		
		long x [] = {1l,2l,3l,5l};
		LongStream stream2 = Arrays.stream(x);
		stream2.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------");
		
		double y [] = {2d,4d,6d,8d};
		DoubleStream stream3 = Arrays.stream(y);
		stream3.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------");
		
		String city [] = {"HYD","DELHI","bhopal"};
		
		Stream<String> stream4 = Arrays.stream(city);
		
		stream4.forEach(System.out::println);
		
	}
}
