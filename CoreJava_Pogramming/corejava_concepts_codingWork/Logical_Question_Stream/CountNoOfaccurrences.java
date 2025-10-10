package Logical_Question_Stream;

import java.util.Scanner;
/*5. Write a program to count the number of
occurrences of each character in a string?
Ex: apple
Output: a-1  p-2 l-1 e-1
*/

public class CountNoOfaccurrences {
	public static void Machine(String str) {
		boolean check[] = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int count = 1;
			if (check[str.charAt(i)] == false) {
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
					}
				}
				check[str.charAt(i)] = true;
			System.out.print(str.charAt(i) + "-" + count + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.nextLine();

		Machine(str);
	}

}
