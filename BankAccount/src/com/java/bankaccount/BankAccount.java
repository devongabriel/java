package com.java.bankaccount;

import java.util.Random;

public class BankAccount {
	private String accountNumber;
	private double savings;
	private double checking; 
	private static int numberOfAccounts=0;
	private static double total=0.0;
	
	public BankAccount() {
		this.accountNumber = this.generateAccountNumber();
		
		numberOfAccounts++;
		
	}
	

	
	public String getAccountNumber() {
		return this.accountNumber;
	}



	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}



	public double getSavings() {
		return savings;
	}



	public void setSavings(double savings) {
		this.savings = savings;
	}



	public double getChecking() {
		return checking;
	}



	public void setChecking(double checking) {
		this.checking = checking;
	}



	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}



	public static void setNumberOfAccounts(int numberOfAccounts) {
		BankAccount.numberOfAccounts = numberOfAccounts;
	}



	public static double getTotal() {
		return total;
	}



	public static void setTotal(double total) {
		BankAccount.total = total;
	}



	private String generateAccountNumber() {
		String acc = "";
		Random r = new Random();
		
		for (int i=0; i < 10; i++) {
			acc += String.valueOf(r.nextInt(9));
		}
		
		return acc;
	}
	
}
