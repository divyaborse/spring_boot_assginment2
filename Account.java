package com.lti.as2;

import org.springframework.stereotype.Component;

@Component
public class Account {
double balance = 5000;

public Account() {
	System.out.println("Default constructor");
	// TODO Auto-generated constructor stub
}

public Account(double balance) {
	System.out.println("Parameterized constructor");
	this.balance = balance;
}

public double deposit(double amount) throws AmountException{
	
	if(amount < 0)
		throw new AmountException("Invalid deposit");
	else
	{
		System.out.println(amount);
		System.out.println("Initial Balance: " + this.balance);
	this.balance = this.balance + amount;
	System.out.println("Valid deposit");
	System.out.println("Balance is:" + this.balance);

	return this.balance;
	}
}
public double withdraw(double amount) throws AmountException,BalanceException{
	
	if( amount <0) {
		throw new AmountException("Invalid withdraw");
		
		//System.out.println("Invalid withdraw");

	}
	else if(amount == this.balance ||amount > this.balance ) {
		throw new BalanceException("Insufficient withdraw");
	}
	else {
	this.balance = this.balance - amount;
	System.out.println("Balance is: " +  this.balance);
	return this.balance;
	}
}

}
