public class FirstLettter {
      static String desplayfirst(String name){
          String result = "";
          String arr[] = name.split(" ");
           for(int i = 0;i<arr.length;i++){
               if(Character.isUpperCase(arr[i].charAt(0))){
                    result+= (Character.toLowerCase(arr[i].charAt(0)))+" ";
               }else{
                    result+= (Character.toUpperCase(arr[i].charAt(0)))+" ";
               }
           
           }
           return result;
      } 
      public static void main(String[] args) {
          String name = "satyam nit techno";

 System.out.println(desplayfirst(name));
      }
}
