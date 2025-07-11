package Array_list;

class SpeciRevom{
    
    public static String moveSpecialCharacters(String str){
		//Implement your code here and change the return value accordingly
		StringBuilder  msg = new StringBuilder();
		StringBuilder last = new StringBuilder();
		
		String result="";
		for(int i = 0;i<str.length();i++){
		    char c = str.charAt(i);
		    if((c>='A' && c<='Z')|| ( c>='a'&& c<='z')||( c>='0' && c<= '9')){
		        msg.append(c);
		    }
		    else {
		        last.append(c);
		    }
		}
        return msg.toString()+last.toString();
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
	
}