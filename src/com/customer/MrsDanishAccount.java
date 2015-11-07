package com.customer;

import com.bank.entity.Account;
import com.bank.simulator.BankingTransactionSimulator;

public class MrsDanishAccount  extends Thread {
	

	Account account ;
	int amount;
	
	
	/**
	 * 
	 */
	public MrsDanishAccount(Account jointAccount , int dollarAmount) { 
		this.account = jointAccount;
		this.amount = dollarAmount;
	}
	
	/**
	 *  when the Thread starts, WithDraw the amount and show the current balance.
	 */
	public void run() {
		
			try {
				Thread.sleep(100);
				
				BankingTransactionSimulator.withdrawal(account,amount);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}

	

	

}
