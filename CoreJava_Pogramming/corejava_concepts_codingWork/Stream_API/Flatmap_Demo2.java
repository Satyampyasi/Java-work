package Stream_API;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Flatmap_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> list1 = Arrays.asList('s','a','t');
		List<Character> list2 = Arrays.asList('y','a','m');
		List<Character> list3 =Arrays.asList('P','y','a','s','i');
		
		List<List<Character>> list = Arrays.asList(list1,list2,list3);
		
	List<Character>  combinelist=	list.stream().flatMap(lis->lis.stream()).collect(Collectors.toList());
	System.out.println(combinelist);
		

	}

}
