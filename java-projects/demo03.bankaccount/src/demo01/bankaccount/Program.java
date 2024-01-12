package demo01.bankaccount;

public class Program {
	
	public static void main(String []args){
		System.out.println("BankAccount V2 example");
		BankAccount a1=new BankAccount(1,"Vivek","p@ss",20000,12);
		//a1.balance=20000;
		//a1.interestRate=12;
		//a1.password="p@ss";
		
		
		
		tryDeposit(a1, 10000);
		//a1.creditInterest();	
		
		tryDeposit(a1, -5000);
		
		
		//We can withdraw even if we don't know the password
		//a1.password="new-password"; //we can change password
		
		tryWithdraw(a1, 10000, "new-password");
		
		
		
		
		
		//System.out.println("Final Balance = "+a1.balance);
		
		a1.show();
		
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
