package Stream_API;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Filter_Demo2 {
public static void main(String[] args) {
	List<String> listofname = List.of("satyam",
			"Aman","karan","Ankit"," Rohit");
	System.out.println(listofname);
	
     List<String> A_person =   listofname.stream().filter(str->str.startsWith("A")).toList();
     System.out.println(A_person);
     
     listofname.stream().filter(str->str.startsWith("A")).forEach(str->System.out.print(" "+str));
     
     Set<String> value =   listofname.stream().filter(str->str.startsWith("A")).collect(Collectors.toSet());
     System.out.println(value); // can modify value.add( "karan")  allowed 
     
}
}
