package Stream_API;
import java.util.*;

public class Sorted_mrthod {

	public static void main(String[] args) {
	List<Integer> nums = Arrays.asList(5,8,6,4,7,1,3,2);
	  nums.stream()
	       .sorted()
	       .forEach(System.out::println);
	}

}
