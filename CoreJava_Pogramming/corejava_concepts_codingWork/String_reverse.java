
import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		System.out.println(" Enter the Character to reverse: ");
		Scanner sc = new Scanner(System.in);
		
		String str =sc.nextLine();
		for(int i =str.length()-1; i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		sc.close();
		

	}

}
