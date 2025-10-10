package String_work;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
	    
		if(num>1) {
			boolean check = false;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					check =true;
				}
				
			}
			System.out.println( check ?"not prime":"is a prime");
			
	}
		else System.out.println("not p");

	}

}
