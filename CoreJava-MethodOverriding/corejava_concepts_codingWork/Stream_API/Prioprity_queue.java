package Stream_API;

import java.util.PriorityQueue;
record Task(String name , Integer priority) {
	
}

public class Prioprity_queue {
public static void main(String[] args) {
	
	
	PriorityQueue<Task> task = new PriorityQueue<>(( t1,t2)->t1.priority().compareTo(t2.priority()));
	task.add(new Task("Sumbit report ",2));
	task.add(new Task(" find bug ",3));
	
	task.add(new Task(" Write program",1));
	while(!task.isEmpty()) {
		System.out.println(" Executing: "+task.poll());
	}
	
}
}
