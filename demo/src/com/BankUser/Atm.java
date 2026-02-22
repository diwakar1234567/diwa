package com.BankUser;

public class Atm implements BankUser{
	public void transaction(double amt,Account a,int choice) {
		Transaction t=new Transaction();
		switch(choice) {
		case 1 -> t.deposite(amt, a);
		case 2 -> t.withdraw(amt, a);
		case 3 -> t.checkBal(a);
		default->
			System.out.println("invalid");
		}
	}
}