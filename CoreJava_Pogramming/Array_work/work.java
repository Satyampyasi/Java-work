public class work {
     public static void main(String[] args) {
         int[] arr = {101, 102, 103, 101, 104, 105, 102};
         int count = 0;
         
         for (int i = 0; i < arr.length; i++) 
         {
             boolean alreadyCounted = false;
             for (int k = 0; k < i; k++) {
                 if (arr[i] == arr[k]) {
                     alreadyCounted = true;
                     break; } 
                    }
             
                 if (!alreadyCounted) {
                 for (int j = i + 1; j < arr.length; j++) {
                     if (arr[i] == arr[j]) {
                         count++;
                         break; }
                          }
                         }
         }

         System.out.println(count + " product IDs are repeated.");
     }
 }