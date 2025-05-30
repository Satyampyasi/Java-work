package pattern_question;

public class holo_tri {
public static void main(String[] args) {
	int num =5;
	for(int i = 1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			if(i==j || j==1||i==num) System.out.print("*");
			else System.out.print(" ");
			
		}
		System.out.println();
	}
}
}
