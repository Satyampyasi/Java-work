class ProductSatyam{
 static int totalproduct =15;
 int  quantity;

void checkStock(int quantity)
{
    if( quantity>0)
   {
   displayproductinfo();
   System.out.println(" Total quantity is "+quantity);
   }
 
     else{
     System.out.println("Insuficeant product");
     } 

}

       public static void main(String[]args)
       {
      ProductSatyam f1 = new ProductSatyam();
      f1.quantity=150;
      f1.checkStock(f1.quantity);
       }

  void displayproductinfo()
     {
  System.out.println(" Total_product price ="+totalproduct);
  System.out.println(" you can buy a product");
     }




}