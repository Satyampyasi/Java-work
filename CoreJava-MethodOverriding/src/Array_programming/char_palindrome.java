package Array_programming;

public class char_palindrome {
	public static void main(String[] args) {
		String store = "abababa";
		String  name = store.toLowerCase();
		
		boolean check = true;
		for(int i = 0;i<name.length()/2;i++) {
			if(name.charAt(i)!=name.charAt(name.length()-1-i)) {
				check = false;
			}
		}
		if(check)System.out.println("palindrome");
		else System.out.println("not palindrome");
		}
	}

