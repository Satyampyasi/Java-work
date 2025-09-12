package Stream_API;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapToInt {

	public static void main(String[] args) {
		List<String> names =Arrays.asList("ravi","Amit","neha");
		IntStream maptoInt = names.stream().mapToInt(String::length);
		maptoInt.forEach(System.out::println);

	}

}
