package Stream_API;
import java.util.stream.Stream;
import java.util.ArrayList;


public class Stram_creation {
public static void main(String[] args) {
	ArrayList<String> listOfcity = new ArrayList<>();
	listOfcity.add("HYD");
	listOfcity.add("MUB");
	listOfcity.add("PUNE");
	listOfcity.add("DELHI");
	listOfcity.add("BANG");
	
	// CONVERTING COLLECTION OBJECT IN TO A STREAM OBJECT 
	Stream<String> city = listOfcity.stream();
	city.forEach(System.out::println);
	
	
}
}
