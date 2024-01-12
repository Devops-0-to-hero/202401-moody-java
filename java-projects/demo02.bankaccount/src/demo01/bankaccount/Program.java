package demo01.bankaccount;

public class Program {
	
	public static void main(String []args){
		System.out.println("BankAccount V2 example");
		BankAccount a1=new BankAccount(1,"Vivek","p@ss",20000,12);
		//a1.balance=20000;
		//a1.interestRate=12;
		//a1.password="p@ss";
		
		a1.deposit(10000);
		//a1.creditInterest();	
		a1.deposit(-5000); //balance shouldn't reduce
		
//		a1.withdraw(50000, "p@ss");
//		a1.withdraw(10000,"wrong-password");
//		a1.withdraw(15000,"p@ss");
		
		a1.withdraw();
		
		//System.out.println("Final Balance = "+a1.balance);
		
		a1.show();
		
	}

}
