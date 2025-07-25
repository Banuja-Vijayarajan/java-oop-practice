import java.util.*;

class BankAccount{
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	
	BankAccount(){
		this.accountNumber=null;
		this.accountHolderName=null;
		this.balance=0.00;
	}
	
	void deposit(double amount){
		if(amount < 0){
			System.out.println("Invalid amount!");
		}
		balance += amount;
		System.out.println("Deposited: "+ amount);
	}
	
	void withdraw(double amount){
		if(amount < 0 && amount >= balance){
			System.out.println("Invalid amount!");
		}
		balance -= amount;
		System.out.println("Withdrawn: "+ amount);
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance=balance;
	}
	
	public String getAccountNumber(){
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber){
		this.accountNumber=accountNumber;
	}
	
	public String getAccountHolderName (){
		return accountHolderName;
	}
	
	public void setAccountHolderName(String accountHolderName){
		this.accountHolderName=accountHolderName;
	}
	
	public static void main(String[] args){
		BankAccount account = new BankAccount();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to our bank");
		System.out.println("Enter your choice:");
		System.out.println("1. Withdraw");
		System.out.println("2. Deposit");
		System.out.println("3. Check current balance");
		System.out.println("4. Exit");
		int choice = sc.nextInt();
		
		double amount;
		
		switch(choice){
			case 1:
			System.out.println("Enter the amount you want to withdraw: ");
			amount = sc.nextDouble();
			account.withdraw(amount); //Pass arguments when calling deposit() and withdraw()
			
			break;
			
			case 2:
			System.out.println("Enter the amount you want to deposit: ");
			amount = sc.nextDouble();
			account.deposit(amount); //Pass arguments when calling deposit() and withdraw()
			break;
			
			case 3:
			System.out.println("Your current balance is: " + account.getBalance());
			break;
			
			case 4:
			System.out.println("Thank you for banking with us!");
			break;
			
			default:
			System.out.println("Invalid choice");
			
		}
	}
}