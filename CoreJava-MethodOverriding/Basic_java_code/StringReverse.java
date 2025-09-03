public class StringReverse {
     static String reversedone(String name){
            String rev="";
           for(int i = name.length()-1;i>=0;i--){
              rev = rev + name.charAt(i);       
           }
           return rev;
     }
     public static void main(String[] args) {
          String name = "satyam";
          System.out.println(name);
          System.out.println(reversedone(name)); 
     }
}
