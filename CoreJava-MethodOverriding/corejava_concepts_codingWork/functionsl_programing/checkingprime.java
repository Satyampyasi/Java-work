package functionsl_programing;


interface prime {
public String isprime(int num);
}


public class checkingprime{
	
//	public static void displaydetail(int num,prime p){
//		System.out.println( p.isprime(num));
//		}
//	
	
	public static void main(String[] args) 
	{
		prime p1 = (num)->{
			if( num ==1||num==0)return "not prime";
				
			else {
				   boolean check=false;
				   for(int i =2;i<=num/2;i++) 
				   {
				   if(num%i==0) {
						check =true;
						break;}
				   }
				     
				if(check)return "not prime";
				else return "Prime";
				
			  }
			
		};
		System.out.println(p1.isprime(15));
//		   displaydetail(45,p1);
		
	}
}