package demo01.bankaccount;

public class BankAccount {

	String name;
	String password;
	int accountNumber;
	double balance;
	double interestRate;
	
	void deposit(double amount) {
		if(amount>0){
			balance+=amount;
			System.out.println("Amount deposited");	
		}
		else {
			System.out.println("Depsoit failed for negative amount");
		}
		
	}
	
	void creditInterest()
	{
		balance+=(balance*interestRate/1200);
		System.out.println("Interst Credited.");
	}
	
	public static void main(String []args){
		System.out.println("BankAccount example");
		BankAccount a1=new BankAccount();
		a1.balance=20000;
		a1.interestRate=12;
		
		a1.deposit(10000);
		//a1.creditInterest();	
		a1.deposit(-5000); //balance shouldn't reduce
		
		System.out.println("Final Balance = "+a1.balance);				
		
	}	
}
