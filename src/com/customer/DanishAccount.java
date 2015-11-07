package com.customer;

import com.bank.entity.Account;
import com.bank.simulator.BankingTransactionSimulator;

public class DanishAccount extends Thread {

	Account account ;
	int amount;
	

	
	
	/**
	 * 
	 */
	public DanishAccount(Account jointAccount , int dollarAmount) { 
		this.account = jointAccount;
		this.amount = dollarAmount;
		
	}
	
	/**
	 *  when the Thread starts, Its add the dollar amount to the current balance
	 */
	public void run() {
		
			try {
				Thread.sleep(100);
				BankingTransactionSimulator.deposit(account, amount);
			} catch (Exception e) {
				e.printStackTrace();
			}
			   
			
	}

}
	

