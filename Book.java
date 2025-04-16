import java.util.Scanner;

class Book_tester {
     private  String tittle;
     private  String author; 
     private  String ISBN;
     private  double price ; 
     private   double discountper;
     public double getfinalprice( double price , double discountper){
          return price- (price*discountper/100);
     }
      public void settittel( String tittle){
        this.tittle= tittle;
      }
      public String gettittle(){ return tittle;}

      public void setauthor(String author){
        this.author = author;
      }
      public String getauthor(){ return author;}

      public void setISBN( String ISBN){
          this.ISBN = ISBN;
      }
      public String getSBIN(){ return ISBN;}

      public void setprice( double price){
          this.price = price;
      }
      public double getprice(){ return price;}

      public void setdiscountper( double discountper ){
      this.discountper = discountper;
      }
      public double getdiscountper(){ return discountper;}
}
public  class Book{

     public static void main(String[] args) {
          Book_tester f1 = new Book_tester();
          Scanner sc = new Scanner(System.in);
          System.out.println(" Enter book name");
          f1.settittel(sc.nextLine());
          System.out.println("Enter authir name");
          f1.setauthor(sc.nextLine());
          System.out.println("ENter isbn no");
          f1.setISBN(sc.nextLine());
          System.out.println("Enter price");
          f1.setprice(sc.nextInt());
          System.out.println("Enter discount:");
          f1.setdiscountper(sc.nextDouble());
           System.out.println("");
          System.out.println("Final price is a "+f1.getfinalprice(f1.getprice(),f1.getdiscountper()));
          System.out.println("Author : "+f1.getauthor());
          System.out.println("Book name "+f1.gettittle());
          System.out.println("SBIN NO: ="+f1.getSBIN());
     }
}
