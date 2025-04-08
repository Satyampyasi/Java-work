public class  MathUtility{

    public static void main(String[] args) {
        MathApplication.showresult();
   }
      static int getsquare(int num){
       return  num*num;
      }

}

 class MathApplication{
 static void showresult(){
   System.out.println(MathUtility.getsquare(5)); 
 }

}
