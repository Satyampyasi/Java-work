class BankAccount{
     String Username;
     int age;
     long Accountno;
     double balance;
     long Contactno;
     
     public static void main(String[] args){
        BankAccount Sbi =    new BankAccount();
        BankAccount canara = new BankAccount();
        BankAccount kotak =  new BankAccount();
        
       Sbi.Username = "Saty98";
       Sbi.age = 21;
       Sbi.Accountno = 364885565l;
       Sbi.balance = 820.0;
       Sbi.Contactno = 9770926390l;
     
     
       canara.Username = "Satyam21";
       canara.age = 21;
       canara.Accountno = 454885565l;
       canara.balance = 920.0;
       canara.Contactno = 9650926390l;
     
     
     
       kotak.Username = "Sat45";
       kotak.age = 21;
       kotak.Accountno = 954885565l;
       kotak.balance = 1020.0;
       kotak.Contactno = 8770926390l;
       
     
      System.out.println("SBI user account detail");
      System.out.println(" username is "+Sbi.Username);
      System.out.println(" age is "+Sbi.age);
      System.out.println(" account number"+Sbi.Accountno);
      System.out.println(" bank balance "+Sbi.balance);
      System.out.println(" Contact number "+Sbi.Contactno);

      System.out.println();
      System.out.println("CanaraBank user account detail");
      System.out.println(" username is "+kotak.Username);
      System.out.println(" age is "+kotak.age);
      System.out.println(" account number"+kotak.Accountno);
      System.out.println(" bank balance "+kotak.balance);
      System.out.println(" Contact number "+Sbi.Contactno);

      System.out.println();
      System.out.println("Kodakbank user account detail");
      System.out.println(" username is "+Sbi.Username);
      System.out.println(" age is "+Sbi.age);
      System.out.println(" account number"+Sbi.Accountno);
      System.out.println(" bank balance "+Sbi.balance);
      System.out.println(" Contact number "+Sbi.Contactno);
       
     }
}
       
     