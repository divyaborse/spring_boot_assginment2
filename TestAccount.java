package com.lti.as2;

import java.util.Scanner;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.junit.runners.MethodSorters;

@ExtendWith(SpringExtension.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@ContextConfiguration(locations="classpath:appctx.xml")


public class TestAccount {
	@Autowired private ApplicationContext appCtx;
	@Autowired 
	private Account a1;
	 @Test
		public void testc() throws AmountException {
			
			
			  System.out.println("Enter amount to deposit 1: ");
			  
			  Scanner sc = new Scanner(System.in);
			  double amount =sc.nextDouble();
			 
			try {
			System.out.println("Testing for valid deposit:");
			
			
				a1.deposit(amount);
			}
			catch(AmountException e) {
				System.out.println("AmountException");
			}
		}
@Test
	  public void testd() throws AmountException {
			
			  System.out.println("Enter amount to deposit : "); Scanner sc = new
			  Scanner(System.in); 
			  double amount =sc.nextDouble();
			 
	  try {
		  System.out.println("Testing for invalid deposit:");
		 		  a1.deposit(amount );
			}
			catch(AmountException e) {
				System.out.println("Invalid amount exception");
			}
	  
	  }
	

@Test
	  public void teste() throws AmountException,
	  BalanceException {
			
			  System.out.println("Enter amount to withdraw 1: "); Scanner sc = new
			  Scanner(System.in); 
			  double amount =sc.nextDouble();
			 
	 try {
		 System.out.println("Testing ValidWithdraw");
				 a1.withdraw(amount);
	 }
	 catch(AmountException e) {
		 System.out.println("AmountException");
	 }
	 catch(BalanceException  e) {
		System.out.println("BalanceException");
	 }
	  
	  }
	 
	  @Test
	  public void testf() throws AmountException,
				BalanceException { 
				 System.out.println("Enter amount to Withdraw 2: "); Scanner sc = new
	  Scanner(System.in);
				 double amount =sc.nextDouble();
									 
	  try {
		  System.out.println("Testing InvalidWithdraw ");
		 
		  a1.withdraw(amount);
			}
			catch(AmountException e) {
				System.out.println("AmountException");
			}
	  
	  
	  }
	  
	  @Test
	  
	  public void testg() 
			  throws 
BalanceException
	  
	  { 
		  
			
			
			 
System.out.println("Testing for InsufficientWithdraw");
System.out.println("Enter amount to Withdraw 3: "); Scanner sc = new
Scanner(System.in);
double amount =sc.nextDouble();
try {
	
a1.withdraw(amount);
}

catch(BalanceException e) {
	System.out.println("BalanceException");
} catch (AmountException e) {
	// TODO Auto-generated catch block
	System.out.println("AmountException");
}
	  }
 

	  
 
	 
}
