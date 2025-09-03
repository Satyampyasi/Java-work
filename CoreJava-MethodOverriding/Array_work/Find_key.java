
public class Find_key {
     public static void main(String [] args){
          int Arr[] = {4,5,6,8,9};
          int key =5;
          System.out.println(findKey(Arr,key)); 
     }

     public static String findKey(int[] arr,int  key){
            for(int i = 0;i<=arr.length;i++){
               if(arr[i]==key)  return "we find a key "+key+"At index "+i;
           
            }
            return "we dont find a key";
     }
}
