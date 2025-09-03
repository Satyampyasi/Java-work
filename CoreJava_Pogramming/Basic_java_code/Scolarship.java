public class Scolarship {
     static int pass_marks = 40;
      double average_marks;
      double attendance;
    public static void main(String[]args){
     
     Scolarship student = new Scolarship();
     
     student.average_marks = 38;
     student.attendance = 80;
     
     if((student.average_marks > 40)  && (student.attendance >75)){
           System.out.println("Elegible for Scholarship ");
     }
     else {
          System.out.println("not elegible for scholarship");
     }
    }
}

