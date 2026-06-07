package com.kunal.lab4.ex1;

 class SavingsAccount extends Account{

		private final double minimumBalance = 500 ;
		
		public SavingsAccount(Person p , double balance ) {
			
			super(p,balance);
		}
		
		public void withdraw (double amount) {
			if(balance - amount >= minimumBalance) {
				balance = balance - amount ;
			}
			else {
				System.out.println("Cannot withdraw  , Minimum balance must be 500 ");
			}
		}
}
