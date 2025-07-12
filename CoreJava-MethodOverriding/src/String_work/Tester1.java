package String_work;

class Tester1 {

	public static int findHighestOccurrence(String str){
		int arr[]= new int[256];
		for(int i =0;i<str.length();i++) {
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		int max =-1;
		char c=' ';
		for(int i=0;i<str.length();i++) {
			if(max < arr[str.charAt(i)]) {
				max = arr[str.charAt(i)];
				c=str.charAt(i);
			}
		}
		
		System.out.println(c);
		return max;
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}
}