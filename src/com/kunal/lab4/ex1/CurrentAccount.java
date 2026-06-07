package com.kunal.lab4.ex1;

public class CurrentAccount extends Account {
	
	private double overdraftLimit = 1000 ; 
	
	public CurrentAccount ( Person p , double balance ) {
		
		super(p,balance);
	}
	
	public void withdraw(double amount ) {
		
		if (balance + overdraftLimit >= amount ) {
			balance = balance - amount ; 
		}else {
			System.out.println("Overdraft limit exceeded ");
		}
	}

}
