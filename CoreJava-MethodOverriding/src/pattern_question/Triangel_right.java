package pattern_question;

public class Triangel_right {
public static void main(String[] args) {
	int num =5;
	for(int i = 1;i<=num;i++) {
		for(int j=num-i+1;j>=1;j--) {
			System.out.print("#");
		}
		System.out.println();
	}
}
}
