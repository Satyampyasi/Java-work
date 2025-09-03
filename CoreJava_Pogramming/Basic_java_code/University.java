import java.util.Scanner;

class student {
     private String name;
     private String course;
     private int duration;

     student(String name) {
          this.name = name;
     }

     student(String name, String course) {
          this.name = name;
          this.course = course;
     }

     student(String name, String course, int duration) {
          this.name = name;
          this.course = course;
          this.duration = duration;
     }

     public String getCoursedetail() {
          return "Course :" + course + "\nName: " + name + "\nDuration" + duration;
     }

     public void changeCourse(String newCourse, int newDuration) {
          this.course = newCourse;
          this.duration = newDuration;
     }
}

public class University {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter name:");
          String nm = sc.nextLine();
          System.out.println("Enter course");
          String cor = sc.nextLine();
          System.out.println("Enter duration");
          int mon = sc.nextInt();

          student s1 = new student(nm);
          student s2 = new student(nm, cor);
          student s3 = new student(nm, cor, mon);

          System.out.println(s1.getCoursedetail());
          System.out.println();
          System.out.println(s2.getCoursedetail());
          System.out.println();
          System.out.println(s3.getCoursedetail());

          System.out.println("Enter new course:");
          sc.nextLine();
          String newcor = sc.nextLine();
          System.out.println("Enter new duration");
          int newdur = sc.nextInt();

          s1.changeCourse(newcor, newdur);
          System.out.println(s1.getCoursedetail());
     }
}
