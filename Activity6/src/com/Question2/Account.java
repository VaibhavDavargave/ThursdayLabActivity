package com.Question2;

public class Account {

	private int balance=10000; //balance
	
	public int balance()
	{
		return balance;
	}
	
	public  void withdraw(int amount) throws InSufficientBalanceException
	{
		if(amount>balance)
		{
			throw new InSufficientBalanceException("NO SufficientFundException" ); //if the amount is greater than balance it will , print InSufficientBalanceException
			
		}
		balance=balance-amount; 
		
			
	}
	
	public void deposit(int amount)
	{
		if(amount<=0)
		{
			throw new IllegalArgumentException("Invalid deposit amount "+amount);
		}
	}
	public static void main(String[] args) {
		Account acct=new Account();
		System.out.println("current balance:"+acct.balance());
		System.out.println("Withdrawing 2000");
		acct.withdraw(2000);
		System.out.println("Current balance : " + acct.balance());
       
		

	}
}
