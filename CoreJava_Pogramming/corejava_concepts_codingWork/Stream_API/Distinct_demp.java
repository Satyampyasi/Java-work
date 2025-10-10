package Stream_API;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Distinct_demp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,3,4,5,5,6,7,8,9,10,10};
       Stream<Integer>  numbers = Stream.of(1,2,3,3,4,5,5,6,7,8,9,10,10);
     IntStream numb = Arrays.stream(arr); 
     
      List<Integer> num= numbers.distinct().toList();
      System.out.println(num);
	}

}
