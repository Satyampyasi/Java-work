//instance variable are accesed directly from non static method 
//instance variable are accesed using object from static method 

public class BankAccountproject {
     long accountNumber;
     double balance;
     String ifsccode , branch;
     // operation to be performend on bankaccount eithdrow , deposite checkbalnce 
     public void withdrow ( double amount){
          if(amount <= balance){
               System.out.println( "$"+amount+"has been withdrow");
               balance-=amount;  
          }
          else 
          System.out.println("insuficient");
          checkbalance();
     }

     public void deposit(double amount){
          System.out.println("$"+amount+"deposuite sussfuly");
          balance+=amount;
          checkbalance();
     }

     public void checkbalance(){
          System.out.println("currents balance "+balance);
     }
     public static void main(String[] args) {
          BankAccountproject b1 = new BankAccountproject();
          b1.balance =2000;
          b1.accountNumber =459466464l;
          b1.ifsccode = "satya487545";
          b1.withdrow(1500);
          b1.deposit(4000);
     }
}
