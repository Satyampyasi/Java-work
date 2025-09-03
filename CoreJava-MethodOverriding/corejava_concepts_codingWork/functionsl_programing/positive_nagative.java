package functionsl_programing;

//import java.util.function.Predicate;
interface checking {
	public boolean ispositive(int num);
}
public class positive_nagative{
	public static void diplaydetail(int num,checking g) {
		if(g.ispositive(num)) System.out.println("positive");
		else System.out.println("negative");
	}
	
    public static void main(String[] args) {
    	  diplaydetail(42,(num)->{
    	    if(num>0)return true;
    	    else return false;
      });
    
	}
}
