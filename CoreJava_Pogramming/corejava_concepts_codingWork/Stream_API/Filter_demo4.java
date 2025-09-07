package Stream_API;

import java.util.Arrays;

public class Filter_demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[] = { "satyam", "karan","arjun","ram","bheam"};
		Object array []  =Arrays.stream(name).filter(nam ->nam.length()>5).toArray();
		System.out.println(Arrays.toString(array));

	}

}
