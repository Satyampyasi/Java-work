package Link_list;

import java.util.LinkedList;

public class Listwork {
public static void main(String[] args) {
	LinkedList <Integer>  list = new LinkedList<>();
	LinkedList<Integer> list2 = new LinkedList<>();
	
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	
	
list.get(0);
list.addFirst(-1);
list.addLast(5);
list.removeIf(x-> x%2==0);
	System.out.println(list);

}
}
