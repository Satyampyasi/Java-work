package Array_programming;
/*An Armstrong number is a number that is the sum of its own digits each raised to the power of the number of digits. 
 * For example, 153 is an Armstrong number since 
 * 1^3 + 5^3 + 3^3 = 153.
 This concept is also known as a Narcissistic number or Pluperfect digital invariant.*/
public class armStrongNumber {
	public static void main(String[] args) {
		int num=153;
		int original=num;
	
		int leng=0;
		
		while(num!=0) {
			num = num/10;
			leng++;
		}
	    num =	original;
		int digit =1;
		double sum=0;
		while(num!=0) {
			digit = num%10;
		    sum = sum + Math.pow(digit,leng);
			num= num/10;
		}
		if(original==sum)System.out.println("ArmStrong Number");
		else System.out.println("not");
	}
}
