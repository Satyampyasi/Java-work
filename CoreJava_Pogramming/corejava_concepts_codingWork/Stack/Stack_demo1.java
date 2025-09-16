package Stack;
import java.util.Stack;

public class Stack_demo1 {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(4);
		stack.push(5);
		stack.push(6);
		Integer removed = stack.pop();
		System.out.println(removed);
		System.out.println(stack);
		
		

	}

}
