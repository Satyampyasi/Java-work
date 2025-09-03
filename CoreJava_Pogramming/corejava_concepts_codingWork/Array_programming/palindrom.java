package Array_programming;

public class palindrom {
public static void main(String[] args) {
	int num = 1234567;
	int reverse=0;
	while(num>0) {
		int remainder = num%10;
		reverse = reverse*10+remainder;
		num= num/10;
	}
	if(num==reverse) System.out.println("is a palindrome");
	else System.out.println("not a palindrome:");
	System.err.println(reverse);
}
}
