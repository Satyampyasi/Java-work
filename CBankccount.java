public class CBankccount {
     double getBalance(){
          return 450;
     }
     public static void main(String[] args) {
          BankSystem.prinntBalance();
     }
}


class BankSystem{
     static void prinntBalance(){
          CBankccount f1 = new CBankccount();
            
            System.out.println(f1.getBalance());
     }
}