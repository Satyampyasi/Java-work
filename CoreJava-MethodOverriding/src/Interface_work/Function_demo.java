package Interface_work;
import java.util.function.*;

public class Function_demo {
	public static void main(String[] args) {
		Function<String, Integer > res = s-> s.length();
		
		 System.out.println( res.apply("satyam"));

		}
	}

