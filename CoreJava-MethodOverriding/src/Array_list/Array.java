package Array_list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Array {
public static void main(String[] args) {
	int arr[]  = new int[10];
	ArrayList<Integer>list = new ArrayList<>();
	list.add(10);
	list.add(20);
	System.out.println(list.get(1));
	list.add(1,50);
//   for(int x:list) {
//	   System.out.println(x);
//   }
   System.out.println(list.size());
   List<String> list2 = Arrays.asList("mom","twe");
   System.out.println(list2);
   
   List<Integer> list3 = List.of(4,5,9,6,7);
   
   list.addAll(list3);
}
}
