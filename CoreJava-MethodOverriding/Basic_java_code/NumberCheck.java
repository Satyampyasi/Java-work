public class NumberCheck{
  static   boolean isEven(int num1){
        return (num1/2)*2==num1?true:false;
     }
     public static void main(String[] args) {

          NumberCheck f1 = new NumberCheck();
          int num1 = Integer.parseInt(args[0]);
       
          if(f1.isEven(num1)){
            System.out.println("Even number");
          }
          else{
               System.out.println("Odd number");
          }
     }
}
