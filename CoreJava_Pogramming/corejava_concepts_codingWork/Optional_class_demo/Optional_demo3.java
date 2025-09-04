package Optional_class_demo;
import java.util.ArrayList;
import java.util.Optional;
public class Optional_demo3 {

	public static void main(String[] args) {
ArrayList<Optional<String>> listofCity = new ArrayList<>();
listofCity.add(Optional.of("hyd"));
listofCity.add(Optional.of("mub"));
listofCity.add(Optional.of("kol"));
listofCity.add(Optional.of("cheni"));

for(Optional<String> optn1: listofCity) {
	if(optn1.isPresent()) {
		System.out.println(optn1.get());
	}
	else System.out.println(" value is not available");
	
}

	}

}
