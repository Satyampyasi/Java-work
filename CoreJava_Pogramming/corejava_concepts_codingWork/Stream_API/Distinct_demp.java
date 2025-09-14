package Stream_API;
import java.util.List;
import java.util.stream.Stream;


public class Distinct_demp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Stream<Integer>  numbers = Stream.of(1,2,3,3,4,5,5,6,7,8,9,10,10);
      List<Integer> num= numbers.distinct().toList();
      System.out.println(num);
	}

}
