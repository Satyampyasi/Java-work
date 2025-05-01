import java.util.Scanner;
class Book{
 private String title;
 private String author;
 private double price;

       Book(){
   this.title="Unknown";
   this.author="Unknown";
   this.price=0.0;
   }


    Book( String title,String author,double price){
    this.author=author;
    this.price=price;
    this.title=title;
    }


 public void displayBookDetails(){
 System.out.println("Title: "+title+"\nAuthor: "+author+"\nPrice: "+price ); 
 }

 public  void calculateLateFee(int day){
 System.out.println("Late Fee for "+day+" days: "+day*1.0);
 }
 public void setTitle( String title){ this.title=title;}
 public String gettitle(){ return title;}

 public void setAuthor( String author){ this.author=author;}
 public String getAuthor(){ return author;}

 public void setPrice(double price){ this.price=price;}
 public double getPrice(){ return price;}
 
}


        
class Magazine extends Book{
private String issueNo;
        Magazine(String title,String author,double price, String issueNo){
          super(author,title,price);
         this.issueNo=issueNo;
        }

         public void displayMagazines(){
         super.displayBookDetails();   
         System.out.println("Issue Number: "+issueNo);
        }

    public void setissueNo( String issueNo){ this.issueNo=issueNo; }
    public String getissueNo(){ return issueNo;}
}


public class LibrarySystemTest{

   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int choice = Integer.parseInt(sc.nextLine());

    if(choice==1){
    String s = sc.nextLine();
    String a = sc.nextLine();  
    int pri = sc.nextInt();

   if(pri>0){Book b1 = new Book("Java Programming", "james Gosling", pri*1.0);
   b1.displayBookDetails(); 
   b1.calculateLateFee(5);}
   else System.out.println("Invalid Price");
   }

else if(choice==2){
Magazine m1 = new Magazine("Jane Smith","Tech Monthly",  30.00, "Issue 5");
m1.displayMagazines();
m1.calculateLateFee(3);

   }

else if( choice==3){
Book b2 = new Book();
b2.setTitle("Learning Java");
b2.setAuthor("Alice Johnson");
b2.setPrice(350.00);
b2.displayBookDetails();
b2.calculateLateFee(2);
   }

   else System.out.println("Invalid choice");


}
}