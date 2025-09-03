package Generics_code;

import java.util.*;

public class WithoutGenerics {
public static void main(String[] args) {
	List list = new ArrayList(); // row data not type safe
	list.add("hello");
	list.add(100); // diffrent type
	
	
	String s =(String) list.get(0); // need to cast 
	System.out.println(s);
}
}
