public class Student{
     boolean hasPassed(int Marks){
         return Marks>40?true:false;
     }
     public static void main(String[] args) {
          Student f1 = new Student();
          int Marks = Integer.parseInt(args[0]); 

           if(f1.hasPassed(Marks)){
           System.out.println(" Student passed! congratulation ");}

           else {
               System.out.println("No you are not passed ");
          }
     }
    

}
