package pattern_question;

public class triangle_left {
public static void main(String[] args) {
	int num =5;
	for(int i =1;i<=num;i++) 
	{
		
		for(int j=num-i+1;j>=1;j--) {
			System.out.print(" ");
		}
		
		for(int j =1 ;j<=i;j++){
		System.out.print("*");
	   }
		for(int j=1;j<=i-1;j++) {
			System.out.print("*");
		}
	     System.out.println();
	
	}
	
	
	}
}
