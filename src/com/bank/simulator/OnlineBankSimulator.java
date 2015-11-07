package com.bank.simulator;
import java.util.List;

import com.bank.data.BankingDatabase;
import com.bank.entity.Account;
import com.bank.entity.Customer;
import com.customer.DanishAccount;
import com.customer.MrsDanishAccount;


/**
 * Understand the program carefully 
 *  
 *  Initially the balance is 500 dollars 
 *  
 *  Danish will deposit 200 dollars in the account - Balance here should  700 Dollar 
 *  
 *  Mrs Danish will withDraw 600 dollars from the account  - Balance here should be 100 dollars
 *  
 *  
 * @author junaidpasha
 *
 */

public class OnlineBankSimulator {
	
	public static void main(String args[]) { 
		
		
		BankingDatabase bankingDatabase = new BankingDatabase();
		Customer customer = bankingDatabase.getJoinAccountInfo("DANISH");
		Account jointAccount = customer.getAccounts().get(0);
	
		
		System.out.println("The initial Balance is " + jointAccount.getBalance());
		System.out.println("                                                    ");
		
		DanishAccount danishAccount = new DanishAccount(jointAccount,200);
		danishAccount.start();
		
		
		

		
		
		MrsDanishAccount mrsdanishAccount = new MrsDanishAccount(jointAccount, 600);
		mrsdanishAccount.start();
		
		
		
		
		
		 
		
		
		
		
	}

}
