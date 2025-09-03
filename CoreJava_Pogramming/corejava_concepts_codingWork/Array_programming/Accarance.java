package Array_programming;

public class Accarance {
public static void main(String[] args) {
	int arr[] = {2,4,6,5,9,2,4,2,9,8,9,9};
	boolean counted[] = new boolean[arr.length];
	for(int i =0;i<arr.length;i++) {
		if(counted[i])break;
		
	    int count=1;
		for(int j =i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
				counted[j]=true;
			}
		}
		System.out.println(arr[i]+" occrance: "+count);
	}
}
}
