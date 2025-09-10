package Stream_API;
// return first character of given name.

import java.util.Arrays;
import java.util.List;


public class Map_demo3 {

	public static void main(String[] args) {
 List<String> s1 = Arrays.asList("karan","satyam","vijay","Sueraj");
 s1.stream()
       .map(name->name.toUpperCase().charAt(0))
             .forEach(System.out::println);
 
 System.out.println(" satyam");

	}

}
