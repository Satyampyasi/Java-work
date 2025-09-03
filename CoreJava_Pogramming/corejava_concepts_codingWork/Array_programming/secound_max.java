package Array_programming;

public class secound_max {
public static void main(String[] args) {
	int arr[] = { 1,2,3,5,8,12,45};
	int max = arr[0];
	int min = arr[0];
for(int i =0;i<arr.length;i++) {
	if(max<arr[i]) max =arr[i];
	if(min>arr[i]) min =arr[i];
	
}
int min2 = Integer.MAX_VALUE;
for(int j =0;j<arr.length;j++) {
	if(arr[j]>min) {
	if(min2>arr[j]) min2 =arr[j];
	}
}
System.out.println(min2);
}
}
