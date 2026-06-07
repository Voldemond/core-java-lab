package com.kunal.lab4.ex1;

class Account {

	private static long accCounter = 1000 ;
	
	private long accNum ;
	
	protected double balance ; 
	
	private Person accHolder ; 
	
	
	public Account (Person accHolder , double balance) {
		
		this.accHolder = accHolder ;
		this.balance = balance ;
		this.accNum = accCounter++ ; 
		
	}
	
	public void deposit(double amount) {
	if(	balance - balance >= 500  ){
			
			balance = balance - amount ;
		} else {
			
			System.out.println("Minimum balance of 500 required ");
		}
	}
	
	public double getBalance() {
		return balance ; 
	}
	
	public long getAccNum() {
		return accNum; 
	}
}
