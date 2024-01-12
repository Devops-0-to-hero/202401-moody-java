package demo01.bankaccount;

public class BankAccount {

	private int accountNumber;
	private String name;
	private String password="";
	
	private double balance;
	private double interestRate;
	private boolean active=true;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public String getPassword() {
//		return password;
//	}
	
	public boolean authenticate(String password) {
		return this.password.equals(Encrypt.hash(password));
	}
	

	private void setPassword(String password) {
		this.password = Encrypt.hash(password);
	}
	
	public boolean changePassword(String oldPassword, String newPassword) {
		if(authenticate(oldPassword)) {
			setPassword(newPassword);
			return true;
		} else {
			return false;
		}
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterestRate() { return interestRate;}
	
	public void setInterestRate(double rate) { 
	
		double delta = interestRate/10;
		
		if( rate>=interestRate-delta && rate<=interestRate+delta)
			interestRate=rate;
		//else
			//don't change
	}
	
	
	public BankAccount(int accountNumber, String name, String password, double amount, double rate)
	{
		this.accountNumber=accountNumber;
		this.name=name;
		//this.password=password;
		setPassword(password);
		
		this.balance=amount; //this is not required, but can we used.
		
		interestRate=rate; //this is no required and hence not used.
		
		
	}
	
	public boolean deposit(double amount) {
		if(amount>0){
			balance+=amount;
			return true; //success	
		}
		else {
			return false; //failure
		}
		
	}
	
	public boolean withdraw(double amount, String password) {
		
		
		if(amount<=0)
			return false;
		else if (amount>balance)
			return false;
		else if (!password.equals(password))
			return false;
		else {
			balance-=amount;
			return true;
		}
	}
	
	public void show() {
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Name:"+name);
		System.out.println("Balance:"+balance);
		System.out.println("Inerest Rate:"+interestRate);
		System.out.println("Password:"+password);
	}
	
	public void creditInterest()
	{
		balance+=(balance*interestRate/1200);
		
	}
	
		
}
