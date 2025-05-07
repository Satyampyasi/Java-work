package overriding;


class BankAccount{
	public double  calculate(double balance) {
	return balance;
	}
	
}

class SavingAccount extends BankAccount{
	public double calculate(double balance) {
		return balance*0.04;
	}
	
}
class CurrentAccount extends BankAccount{
	public double calculate(double balance) {
		return balance*0.03;
	}
}

class FixedDepositeAccount extends BankAccount{
	public double calculate(double balance) {
		return balance*0.065;
	}
}



public class bank {
	public static void main(String[] args) {
		BankAccount account1 = new SavingAccount();
		System.out.println(account1.calculate(10000)); // 400.0

		BankAccount account2 = new CurrentAccount();
		System.out.println(account2.calculate(10000)); // 300.0

		BankAccount account3 = new FixedDepositeAccount();
		System.out.println(account3.calculate(10000)); // 650.0
	}

}
