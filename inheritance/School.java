import java.util.Scanner;

class Student{
 protected String name;
 protected int rollNumber;
 Student(String name, int rollNumber){
      this.name=name;
      this.rollNumber=rollNumber;
 }
 public void displayDetails(){
     System.out.println("Name: "+name);
     System.out.println("RollNumber: "+rollNumber);
 }
 public double calculatePercentage(int ph,int ch,int mat ){
  return (ph+ch+mat)/3;
 }
}

class ScienceStudent extends Student{
    private int physicsMarks;
    private int chemistryMarks;
    private int mathMarks;
    ScienceStudent(String name, int rollno,int ph,int ch,int mat){
     super(name,rollno);
     this.mathMarks=mat;
     this.chemistryMarks=ch;
     this.physicsMarks=ph;
    }
  
    public void displayDetails(){
     System.out.println("Science Student detail:");
     super.displayDetails();
     System.out.println("physics mark"+physicsMarks);
     System.out.println("chemistry: marks"+chemistryMarks);
     System.out.println("math marks:"+mathMarks);
     System.out.println("Percentage:"+super.calculatePercentage(mathMarks,chemistryMarks,physicsMarks)+"%");
    }

}


class ArtStudent extends Student{
      private int historyMarks;
      private int geographyMarks; 
      private int englishMarks;
      ArtStudent(String name, int rollno,int ph,int ch,int mat){
          super(name,rollno);
          this.historyMarks=ph;
          this.geographyMarks=ch;
          this.englishMarks=mat;
      }
      public void displayDetails(){
          System.out.println("Art Student detail:");
          super.displayDetails();
          System.out.println("history mark"+historyMarks);
          System.out.println("geograpy: marks"+geographyMarks);
          System.out.println("English:"+englishMarks);
          System.out.println("Percentage:"+super.calculatePercentage(historyMarks,geographyMarks,englishMarks)+"%");
         }
     

}





public class School{
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
               System.out.println(" enter 1 for science  2 for Art");
               int choice = sc.nextInt();
               switch (choice) {
                    case 1:
ScienceStudent s1 = new ScienceStudent("Anjali", 101, 85, 90, 80);
 s1.displayDetails();
                         break;
                       
                    case 2:
ArtStudent a1 = new ArtStudent("Aryan", 102, 75, 80, 85);
a1.displayDetails();
                         break;
                         default: System.out.println("invalid detail");
               }
     }
}
