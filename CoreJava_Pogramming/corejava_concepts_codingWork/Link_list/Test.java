package Link_list;

public class Test {
public static void main(String[] args) {
	Node node1 = new Node();
	Node node2 = new Node();
	node2.value=2;
	node1.next =null;
	
	node1.value=1;
	node1.next =node1;
}
}
class Node{
	public int value;
	public Node next;
}