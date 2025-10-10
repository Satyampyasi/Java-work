package String_work;

import java.util.Arrays;
import java.util.List;

public class Duplicate_remove {

	public static void main(String[] args) {
		String str ="bannas";
 List<String> unique=Arrays.stream(str.split("")).distinct().toList();
 System.out.println(unique);
	
	 

	}

}
