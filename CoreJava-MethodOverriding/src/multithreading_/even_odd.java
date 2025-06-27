package multithreading_;
/*
 * Write a program for following requirements :
Create a multithreaded application in which Even no from 1 to 10 and odd numbers from 1 to 10 Are printed concretely solve the problem in three different way 
extending thread  implementing runnable performing functional programing  by using functional interface runnable and lambda expression */

class mythread extends Thread{
	public void run() {
		
		for(int i = 1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i+"Even");
			}
		 }
	 }
  }

public class even_odd {
	
 public static void main(String[] args) {
	 mythread th = new mythread();
	 th.start();
	 for(int i = 1;i<=10;i++) {
		 if(i%2!=0) {
			 System.out.println(i+"odd");
		 }
	 }
	 
 }
}
