package certificate_coding;

class Removespace {
	public static String removeDuplicatesandSpaces(String str) {
		boolean arr[] = new boolean[256];
		String newword = "";
		int i;
		for ( i = 0; i < str.length(); i++) {
			for (int j = 1 + i; j < str.length()-i; j++) {
				if (str.charAt(i) != str.charAt(j)) {
                       arr[str.charAt(i)]=true;
				}
			}
			 
		}
		
		
		
		return newword;
	}

	public static void main(String args[]) {
		String str = "object oriented programming";
		System.out.println(removeDuplicatesandSpaces(str));
	}
}