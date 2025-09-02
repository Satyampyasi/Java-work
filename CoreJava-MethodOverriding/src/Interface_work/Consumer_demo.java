package Interface_work;
import java.util.function.*;

public class Consumer_demo {
	public static void main(String[] args) {
		
Consumer<String> res = s-> System.out.println(s.toUpperCase());

res.accept("satyam");
		
	}

}
