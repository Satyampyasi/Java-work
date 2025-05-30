package functionsl_programing;
import java.util.Arrays;
@FunctionalInterface
public interface DataFilter {
public boolean check(int value); //10 
//	if(a%2==0) 
//	return true;
//	else return false;
//          }
}

class mainclass{
	public static void  filterdata(int arr[],DataFilter f){
		//int arr[]= {10,20,9,6,15,7,5};
		/*
		 DataFilter f = (a)->{ 
			if(a%2==0) 
			return true;
			else return false;*/
	
		
		for(int s: arr){ //10 20
			if(f.check(s)) System.out.println(s); //10
		}
		  }
		
		
	    public static void main(String[] args) {
		int arr[]= {10,20,9,6,15,7,5};
		System.out.println("Element Stored"+Arrays.toString(arr));
		
		
		filterdata(arr,(a)->{ 
			if(a%2==0) 
			return true;
			else return false;
		          }
		);
		System.out.println("=====================================================================================");
				filterdata(arr,(a)->{
			if(a>10) return true;
			else return false;
		});
		
		
	}
}