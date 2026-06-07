package com.kunal.lab4.ex1;

public class Exercise_1 {
	
	
	public static void main(String[] args) {
		
		Person smith = new Person("Smith" , 30 ); 
		Person kathy = new Person("Kathy" ,28 );
				
				SavingsAccount acc1 = new SavingsAccount(smith , 2000);
		
				CurrentAccount acc2 = new CurrentAccount(kathy , 3000); 
				
				acc1.deposit(2000); 
				
				acc2.withdraw(2000);
				
				System.out.println("Smith Balance : "+acc1.getBalance());
				
				System.out.println("Kathy Balance : "+ acc2.getBalance());
	}
}
