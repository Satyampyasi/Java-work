package Stream_API;

import java.util.Arrays;
import java.util.List;

public class Lazy_Evalution {

	public static void main(String[] args) {
	    List<String> fruit =  Arrays.asList("Apple","banana","mango","Avacado","papaya");
	    
	fruit.stream()
	     .filter(fru->{
		     System.out.println("filtering:"+fru);
		     return fru.startsWith("A");
	})
	 .forEach(System.out::println);
	  System.out.println("*****************************************************************"); 
		fruit.stream().filter(fru->fru.startsWith("A"))
		.forEach(fru->System.out.print(" "+fru));
	}

}
