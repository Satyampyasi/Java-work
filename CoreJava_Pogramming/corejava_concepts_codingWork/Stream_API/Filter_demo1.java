package Stream_API;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Filter_demo1 {

	public static void main(String[] args) {
		List<Integer> listOfnumber = Arrays.asList( 15,12,18,16,14,17,1,2,4,6,7,9);
		
		// Without using Stream;
		List<Integer> newlist = new ArrayList<>();
		for( Integer num : listOfnumber) {
			if( num%2==0) {
				newlist.add(num);
			}
		}
		// using stream 
		System.out.println(newlist.toString());
		 System.out.println("***********************************************************");
		
		 listOfnumber.stream().filter(value -> value%2==0).forEach(System.out::print);
		 
		 System.out.println("\n***********************************************************");
		 
		 listOfnumber.stream().filter(num->num%2!=0).forEach(num->System.out.println("odd :"+num));
		
		System.out.println("\n------------------------------------------------------------");
		
		  List<Integer>  evenlist= listOfnumber.stream()
		                .filter( num->num%2==0)
		                      .toList();
		  System.out.println(evenlist);
	}

}
