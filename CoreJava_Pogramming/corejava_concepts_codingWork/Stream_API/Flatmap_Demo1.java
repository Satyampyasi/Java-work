package Stream_API;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flatmap_Demo1 {

	public static void main(String[] args) {
		List<String> fruit = Arrays.asList("mango","apple","banana");
		
     List<String> vegi = Arrays.asList("potato","tamatar","ladyfinger");
     
     List<List<String>> plant = Arrays.asList(fruit,vegi);
     
 List<String> singlelist =    plant.stream().flatMap(pla->pla.stream()).collect(Collectors.toList());
 System.out.println(singlelist);

	}

}
