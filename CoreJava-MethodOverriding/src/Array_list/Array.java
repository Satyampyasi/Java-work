package Array_list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Array {
public static void main(String[] args) {
	ArrayList<Integer>list = new ArrayList<>();
	list.add(10);
	list.add(20);
	System.out.println(list.get(1));
	list.add(1,50);

   System.out.println(list.size());
   
   List<String> list2 = Arrays.asList("mom","twe");
   System.out.println(list2);
   
   List<Integer> list3 = List.of(4,5,9,6,7);
   
   list.addAll(list3);
  System.out.println(list);
}
}
