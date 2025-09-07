package Stream_API;
import java.util.Arrays;
// check prime number from giving number;



public class filter_demo5 {
	public static void main(String[] args) {
		
		 int number []= { 2,4,1,6,8,7,15,17,19,26,47};
		 
		 filter_demo5 f1 = new filter_demo5();

		 int prime[] =    Arrays.stream(number).filter(num-> f1.isprime(num)).toArray();
		 
		 System.out.println(Arrays.toString(prime));

           
            
				 

		
	}
          boolean isprime(int num) {
		 
   	 if(num<2) {
   		 return false;
   	 }
   	  {
   		 for( int i =2 ;i<=Math.sqrt(num);i++) {
   			  if(num%i==0) return false;
   			 
   		 }
   		 
   	 }
	return true;
		
	 }


}