package Array_programming;
import java.util.Scanner;

//0, 1, 1, 2, 3, 5, 8, 13,
public class fabonaci {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num= sc.nextInt();
	sc.close();
	int first =0;
	int secound =1;
	for(int i=1;i<=num;i++) {
		System.out.println(first+" ");
		int next = first +secound;
		first = secound;
		secound = next;
	}
}
}

