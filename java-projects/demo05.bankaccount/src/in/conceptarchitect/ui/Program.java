package in.conceptarchitect.ui;

import in.conceptarchitect.finance.BankAccount;

public class Program {
	
	public static void main(String []args){
		
		BankAccount a1=new BankAccount( "Vivek", "p@ss", 25000);
		
		BankAccount a2=new BankAccount( "Sanjay", "p@ss2", 25000);
		
		System.out.println(a1.info());
		System.out.println();
		System.out.println(a2.info());
		
		
		
		System.out.println("\n\nChanging the interst rate for a1");
		
		//a1.setInterestRate(11);
		
		BankAccount.setInterestRate(11);
		
		System.out.println(a1.info());
		System.out.println();
		System.out.println(a2.info());
		
		
		
		
		
		
		
	}
	
	static void tryWithdraw(BankAccount account, double amount, String password){
		if(account.withdraw(amount, password))
			System.out.println("Please take your cash : Rs"+amount);
		else
			System.out.println("Withdrawal Failed");
		
	}

	private static void tryDeposit(BankAccount account, double amount) {
		if(account.deposit(amount))
			System.out.println("Deposit succeeded for Rs "+amount);
		else
			System.out.println("Deposit failed for Rs"+amount);
	}

}
