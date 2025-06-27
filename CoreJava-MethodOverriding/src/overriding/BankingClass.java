package overriding;
/*WAP to demonstrate the use of custom exception named as
InvalidCredentials and InsufficientFunds in a banking
application.
Create an application to replicate the common operations which
are performed through a banking app,such as:
checkBalance(),
withdraw(),
transfer(),
deposit() etc.

While making transfer into another account, we must get readable
message about the balance update in both the account.*/

import java.util.ArrayList;

class InvalidCredential extends Exception {
	
}

class InsufficentBalance extends Exception {
}

class BankAccount {
    int AccountNo;
    int AdharNo;
    String UserName;
    String IFSC;
    double balance;

    BankAccount(int accountNo, int adharNo, String userName, String iFSC, double balance) {
        this.AccountNo = accountNo;
        this.AdharNo = adharNo;
        this.UserName = userName;
        this.IFSC = iFSC;
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "BankAccount[" +
               "accountNumber=" + AccountNo+
               ", customerName='" + AdharNo + '\'' +
               ", balance=" + balance +
               ", branchCode='" +IFSC+ '\'' +
               ", minimumBalance=" +  +
               ']';
    }

    public void LoginBank(int Adno, String UserN) throws InvalidCredential {
        if (AdharNo == Adno && UserName.equals(UserN)) {
            System.out.println("You successfully logged in");
        } else {
            throw new InvalidCredential();
        }
    }

    public void CheckBalance() {
        System.out.println(balance);
    }

    public void deposite(double deposite) {
        balance = balance + deposite;
        System.out.println("Balance after deposit: " + balance);
    }

    public void withdrow(int widro) throws InsufficentBalance {
        if (widro <= balance) {
            balance -= widro;
            System.out.println(widro+" Withdrawal successful. \nNew balance: " + balance);
        } else {
            throw new InsufficentBalance();
        }
    }

    public void transfer(BankAccount b, double amt) throws InsufficentBalance {
        if (balance - amt < 0) {
            throw new InsufficentBalance();
        } else {
            balance = balance - amt;
            b.deposite(amt);
        }
    }
}

public class BankingClass {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(45454, 800000, "satyam", "SBI454", 80000);
        BankAccount b2 = new BankAccount(2525, 900000, "ram", "CNB454", 4500);
        ArrayList<BankAccount> people = new ArrayList<>();
           people.add(b1);
           people.add(b2);
           System.out.println(people.get(0));
        try {
            b1.LoginBank(800000, "satyam"); 
            try {
            b1.CheckBalance();
            b1.withdrow(4500);
            } catch (InsufficentBalance b) {
                System.out.println("Low balance cannot withdraw");
            }
        } catch (InvalidCredential d) {
            System.out.println("Invalid details entered");
        }

        try {
            b2.transfer(b1, 450);
        } catch (InsufficentBalance b) {
            System.out.println("Low balance cannot transfer");
        }
    }
}