public class Tempreature{
      
      public double convtofer(double celsis){
      return celsis*(9/5)+32;
      }
      public   static void converttem(){
           Tempreature f1 = new Tempreature();
       
           System.out.println(f1.convtofer(85));

      }
      public static void main(String[] args) {
             converttem();
      }

}
