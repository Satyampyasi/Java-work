package Array_programming;


import java.util.Arrays;

public class bubble_short {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 9, 4, 5, 8 };
		System.out.println("===================Array before shorting ===================== ");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] >arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Array After  accesnding  shorting ===================== ");
		System.out.print(" "+Arrays.toString(arr));
		
		
		
	}

}
