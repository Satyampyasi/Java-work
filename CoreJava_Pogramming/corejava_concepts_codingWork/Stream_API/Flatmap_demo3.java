package Stream_API;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Flatmap_demo3 {

	public static void main(String[] args) {
		List<String> listofname=Arrays.asList("java","karan","Arjun","Vijay");
	listofname.stream()
	     .flatMap(str ->Stream.of(str.charAt(0)))
	         .forEach(System.out::println);
		
	}

}
