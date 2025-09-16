package String_work;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Peek_method {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Satyam","karan","vijay","tarun","ravan");
	
		List<String>  collect =  	names.stream().filter(name->name.length()>4)
		       .peek( name-> System.out.println( "filtered"+ name.toLowerCase()) )
		          .map(String::toUpperCase)
		            .peek(name -> System.out.println("Mapped"+name))
		              .toList();
		            System.out.println(collect);

	}

}

