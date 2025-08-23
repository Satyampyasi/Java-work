package functionsl_programing;


interface checkeven{
  public void iseven(int num );
}




public class Iseven {
public static void main(String[] args) {
  int digit =10;
	checkeven p1  = (num)->{
		if(num%2==0) {
			System.out.println("Even number");
		}
		else System.out.println("Odd number ");
	};
	p1.iseven(digit);
}
}