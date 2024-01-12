package demo01.bankaccount;

public class BankAccount {

	int accountNumber;
	String name;
	String password="";
	
	double balance;
	double interestRate;
	
	public BankAccount(int accountNumber, String name, String password, double amount, double rate)
	{
		this.accountNumber=accountNumber;
		this.name=name;
		this.password=password;
		
		this.balance=amount; //this is not required, but can we used.
		
		interestRate=rate; //this is no required and hence not used.
		
		
	}
	
	void deposit(double amount) {
		if(amount>0){
			balance+=amount;
			System.out.println("Amount deposited");	
		}
		else {
			System.out.println("Depsoit failed for negative amount");
		}
		
	}
	
	void withdraw() {
		double amount=Input.readInt("Amount?");
		String confirmPassword=Input.readString("Password?");
		
		if(amount<=0)
			System.out.println("Invalid Amount");
		else if (amount>balance)
			System.out.println("Insufficient Balance");
		else if (!password.equals(confirmPassword))
			System.out.println("Invalid credentials");
		else {
			balance-=amount;
			System.out.println("Please take your cash");
		}
	}
	
	void show() {
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Name:"+name);
		System.out.println("Balance:"+balance);
		System.out.println("Inerest Rate:"+interestRate);
	}
	
	void creditInterest()
	{
		balance+=(balance*interestRate/1200);
		System.out.println("Interst Credited.");
	}
	
		
}
