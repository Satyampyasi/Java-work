public class BankAccountInfo {
         static float rate = 7.5F;
         long Accountno;
         double balance;
         public static void main(String[]args){
        BankAccountInfo user1 = new BankAccountInfo();
        BankAccountInfo user2 = new BankAccountInfo();

        //user1.rate =  7.5f;  BankAccountInfo.rate=8.5f

        user1.Accountno = 46557854l;
        user1.balance = 1450*rate;
	
        user2.Accountno =898989845;
        user2.balance = 2500*rate;
        
        System.out.println(" ==========User1 detail ======");
        System.out.println(" User1 Account number "+user1.Accountno);
        System.out.println(" User1 Bank balance "+user1.balance);
        System.out.println();


        System.out.println(" ==========User2 detail ======");
        System.out.println(" User2 Account number "+user2.Accountno);
        System.out.println(" User2 Bank balance "+user2.balance);
        System.out.println();

       }
}

