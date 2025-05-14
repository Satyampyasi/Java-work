public class Numberbig {
     String findlarger(int num1,int num2){
           if(num1==num2) {
               return "both are equal";
           }
           else if( num1>num2){
               return "num1 is greater ";
           }
           else {
               return "num2 are greater";
           }
     }

     public static void main(String[] args) {
          Numberbig f1 = new Numberbig();
          int num1 = Integer.parseInt(args[0]);
          int num2 =Integer.parseInt(args[1]);
          System.out.println(f1.findlarger(num1,num2));
     }
    

}
