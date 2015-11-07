package com.bank.simulator;

import com.bank.entity.Account;

/**
 * 
 * @author junaidpasha
 *
 */
public class BankingTransactionSimulator {
	
	private static Account account;

	
	/**
	 * 
	 * @param accountInfo
	 * @param dollarAmount
	 * @return
	 */
 	public synchronized static Account withdrawal(Account accountInfo, int dollarAmount) {
 		
 		System.out.println("*******Doing the Withdrawal of " +dollarAmount+ " from  "+accountInfo.getBalance()+ "***********");
 		account = accountInfo;//Make the accountInfo object passed as your current account
		double newbalance = account.getBalance() - dollarAmount;
		account.setBalance(newbalance);
		System.out.println("                                                    ");
		try {
			Thread.sleep(10); // allow task-switch
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("*******New Balance after withdrawal is " +account.getBalance()+ "***********");
		return account;
	}
 	
 	
 	

	/**
	 * 
	 * @param accountInfo
	 * @param dollarAmount
	 * @return
	 */
 	public synchronized static  Account deposit(Account accountInfo, int dollarAmount) {
 		account = accountInfo;//Make the accountInfo object passed as your current account
		
 		System.out.println("*******Doing the Deposit of " +dollarAmount+ " to "+accountInfo.getBalance()+ "***********");
 		double newbalance = account.getBalance() + dollarAmount;
		account.setBalance(newbalance);
		
		System.out.println("                                                    ");
		try {
			Thread.sleep(10); // allow task-switch
		} catch (InterruptedException exc) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("*******New Balance after deposit is " +account.getBalance()+ "***********");
		System.out.println("                                                    ");
		return account;
	}
 	
 	
 	
		}
