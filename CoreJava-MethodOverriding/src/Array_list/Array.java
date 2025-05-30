package Array_list;
import java.util.ArrayList;
public class Array {
public static void main(String[] args) {
	ArrayList<Integer> list  = new ArrayList<Integer>();
//	ArrayList<String> List2 = new ArrayList<String>();
// add element
	list.add(5);
	list.add(2);
	list.add(3);
	System.out.println(list);
//	int element =list.get(2); it gives a elenmnt at given index;
	
	System.out.println(list.get(0)); 
//	list.add(0,5); here we  can add 5 to  tha index no 0;
	list.add(1,9);
	System.out.println(list);
	list.set(0, 6);
	System.out.println(list);
	list.remove(3);
	System.out.println(list);
	System.out.println(list.size());
	for(int i = 0;i<list.size();i++){
		System.out.println(list.get(i));
	}
	
}
}
