package certificate_coding;

class Removespace {
	public static String removeDuplicatesandSpaces(String str) {
		
		boolean arr[] =new boolean[256];
		
		StringBuilder  newword = new StringBuilder();
		for ( int i = 0; i < str.length(); i++) {
			   char current = str.charAt(i);
			   if(current==' ')  continue;
			   
			   if(!arr[current]) {
				   newword.append(current);
				   arr[current]=true;
			   }
		}
		
		return newword.toString();
	}

	public static void main(String args[]) {
		String str = "object oriented programming";
		System.out.println(removeDuplicatesandSpaces(str));
	}
}