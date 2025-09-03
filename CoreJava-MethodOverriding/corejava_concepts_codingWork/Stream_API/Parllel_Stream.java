package Stream_API;
import java.util.stream.Stream;
import java.util.ArrayList;

public class Parllel_Stream {
public static void main(String[] args) {
	ArrayList<String> listOfcity = new ArrayList<>();
	listOfcity.add("HYD");
	listOfcity.add("MUB");
	listOfcity.add("PUNE");
	listOfcity.add("DELHI");
	listOfcity.add("BANG");
	
	Stream<String> city = listOfcity.parallelStream();
	city.forEach(System.out::println);
}
}
