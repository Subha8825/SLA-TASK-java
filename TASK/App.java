package com.index;
class BankAccount1{
	double balance;
	public BankAccount1(double balance) {
		this.balance=balance;
	}
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println(amount + " Amount added successfully");	
		}
		else {
			System.out.println("Enter valid amount ");
			
		}	
		
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println(amount +" Amount withdraw Successfully");
		}
		else {
			System.out.println("Enter valid amount");
			
		}
		
	}
	public void getbalance() {
		System.out.println("Total balance"+balance);
	}
}
class SavingAccount extends BankAccount1{
	public  SavingAccount(double balance) {
		super(balance);
	}
	public void withdraw(double amount) {
		if(amount>0) {
			if(balance-amount>=100) {
				balance-=amount;
				System.out.println("Withdrawn from Savings: ₹" + amount);
			}
			else {
				System.out.println("Withdrawal denied. Minimum balance ₹100 must be maintained.");

			}
		}
			else {
				 System.out.println("Invalid withdrawal amount.");

			}
		}
	
	
}

public class App {

	public static void main(String[] args) {
		SavingAccount obj=new SavingAccount(500);
		obj.deposit(200);
		obj.withdraw(300);
		obj.getbalance();
		obj.withdraw(500);
		// TODO Auto-generated method stub

	}

}
