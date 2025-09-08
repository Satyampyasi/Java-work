package Stream_API;
import java.util.Arrays;
import java.util.List;

public class Map_demo1 {

	public static void main(String[] args) {
		List<Integer>  Listofnumber = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	  	Listofnumber.stream().map(num->num+10).toList().forEach(num->System.out.println(" "+num));
// Find all even numbers and find  the cube root of those numbers
	  	List<Integer> immutableList = List.of(1,2,3,4,5,6,7,8,9,10);
	  List<Integer>	list= immutableList.stream()
	  	      .filter(num->num%2==0)
	  	          .map(num->num*num)
	  	                .toList();
	  System.out.println(list);
	}

}
