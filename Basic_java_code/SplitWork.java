public class SplitWork {
      public static void main(String[] args) {
          String name = "ram shyam gulam";
          String  arr[] = name.split(" ");
          for(int i = 0;i<arr.length;i++){
               if(Character.isUpperCase(arr[i].charAt(0))){
               System.out.println(Character.toLowerCase(arr[i].charAt(0)));
               }
               else{
               System.out.println(Character.toUpperCase(arr[i].charAt(0)));
               }
          }
     }
}

