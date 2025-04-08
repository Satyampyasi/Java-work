public class OnlineLibrary {
     static String  getLIbraryname(){
          return " focused_point";
     }
   public void  displayWelcome(){
          System.out.println("Welcome in a libarary ");
          String name =   getLIbraryname();
           System.out.println("Libarary name is "+name);
     }    
     public static void main(String[] args) {
         OnlineLibrary f1 = new OnlineLibrary();
          f1.displayWelcome();
     }
}
