package multithreading_;

/*
 * Write a program for following requirements :
Create a multithreaded application in which Even no from 1 to 10 and odd numbers from 1 to 10 Are printed concretely solve the problem in three different way 
extending thread  implementing runnable performing functional programing  by using functional interface runnable and lambda expression */
public class evenodd2  {
	public static void main(String[] args) {
		Runnable r = ()->{
			for(int i =0;i<=10;i++) {
				if(i%2==0) {
					System.out.println("Even"+i);
				}
			}
		};
		
	Thread th = new Thread(r);
	th.start();
	for(int i =0;i<=10;i++) {
		if(i%2!=0)System.out.println("odd"+i);
	}
	
	}
}