package Optional_class_demo;
 import java.util.Optional;
 import java.util.stream.Stream;

public class ofNullable_method {
public static void main(String[] args) {
	String str =null;
	  Optional<String> container= Optional.ofNullable(str);
	  container.ifPresent(value->System.out.println("value is "+value));
	  
}
}
