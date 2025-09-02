package Interface_work;
import java.util.Random;
import java.util.function.*;

public class Supplier_demo {
public static void main(String[] args) {
	Supplier<Integer > luckyNo = ()-> new Random().nextInt(100);
	
	System.out.println(luckyNo.get());
}
}
