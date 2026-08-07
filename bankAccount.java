package com.scanner;

public class bankAccount {
				private int Accountnumber;
				private String holder;
				private Double balance;
				
				
				public bankAccount(int Accountnumber,String holder,Double balance) {
					this.Accountnumber=Accountnumber;
					this.holder=holder;
					this.balance=balance;
				}
				//getters
				public int getAccountnumber() {
					return Accountnumber;
				}
				public String getHolder() {
					return holder;
				}
				public Double getBalance() {
					return balance;
				}
				public void setbalance(double balance) {
					this.balance=balance;
				}
				public void deposit(double amount) {
					if (amount > 0 ) {
						balance += amount;
						System.out.println("amount deposited:"+amount);
						System.out.println("updates Balamce:"+balance);
					}
				}
					public void withdraw(double amount) {
						if (balance >= amount) {
							balance = balance - amount;
							System.out.println("withdrwal Amount:"+amount);
							System.out.println("Remaining balance:"+balance);
						}else {
							System.out.println("insufficient balance");
						}
					}
					
	}


