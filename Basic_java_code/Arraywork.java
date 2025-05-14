import java.util.Scanner;

public class Arraywork {
    static void even(int[] arr) {
        int sum = 0;
        int eve = 0;
        int odd = 0;
        
        System.out.println("\nEven numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
                eve += arr[i];
            }
            sum += arr[i];  
        }
        System.out.println("Sum of even numbers: " + eve);
        
        System.out.println("\nOdd numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
                odd += arr[i];
            }
        }
        System.out.println("Sum of odd numbers: " + odd);
        System.out.println("\nTotal sum of all elements: " + sum);
        
        System.out.println("\nPositive numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
            }
        }
        
        System.out.println("\nNegative numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array element " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        
        even(arr);
    }
}