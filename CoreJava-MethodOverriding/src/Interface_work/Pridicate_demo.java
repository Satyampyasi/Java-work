package Interface_work;
//import java.util.function.Predicate;
public class Pridicate_demo {
public static void main(String[] args) {
	
//	Predicate<Integer>  result =  s->s>5;
//	
//	
//	System.out.println( result.test(1));
	
	checkSum c1 = ((num1,num2)->{
		return num1+num2;
	});
	
	c1.giveResult(12 ,8);
}
}

interface checkSum{
	public int  giveResult(int a ,int b);
}