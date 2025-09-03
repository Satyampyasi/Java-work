package Array_programming;

public class NoOfAccrance {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 9, 2,8, 4, 2, 9, 8, 9 };
		boolean visit[] = new boolean[arr.length];
		for (int i = 0; i < arr.length; i++) {
		if (visit[i])
		   continue;

			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visit[j] = true;
				}

			}
			System.out.println(arr[i] + " accaurance " + count + " times");

		}
	}
}
