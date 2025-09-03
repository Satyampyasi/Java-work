
class LibraryBook{
  String title , author;
  LibraryBook(String title , String author){
          this.title=title;
          this.author=author;
  }
}
class book extends LibraryBook{
   int selfnumber;
   book( String title, String author,int selfnumber){
     super(title,author);
     this.selfnumber=selfnumber;
   }
}

class student extends LibraryBook{
     student( String x ,String y){
          super(x,y);
     }
}

public class MainClass {
     public static void main(String[] args){
book b1 = new book("nahraj","satyam",001);
student s1 = new student("ram", "ramayan");
System.out.println("Author:"+b1.author+"\nBook:"+b1.title+"\nSelfno"+b1.selfnumber);
System.out.println();
System.out.println("Author:"+s1.author+"\nBook:"+s1.title);
           
     }
}


