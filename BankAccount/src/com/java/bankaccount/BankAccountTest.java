package com.java.bankaccount;

public class BankAccountTest {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			BankAccount b = new BankAccount();
			BankAccount b1 = new BankAccount();
			
			System.out.println(b.getAccountNumber());
			System.out.println(b1.getAccountNumber());
			
			b.deposit("checking", 1000.0);
			b.deposit("savings", 100.0);
			
			
			System.out.println(b.getChecking());
			System.out.println(b.getSavings());
			System.out.println(BankAccount.getTotal());
			System.out.println(BankAccount.getNumberOfAccounts());
			

		}
}
