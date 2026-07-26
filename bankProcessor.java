package com.scanner;

import java.util.Scanner;

import com.constructor.bankAccount;

public class bankProcessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Account number:");
		int number=sc.nextInt();
		sc.nextLine();
		System.out.println("account holder name:");
		String name = sc.nextLine();
		System.out.println("Account balance:");
		double balance= sc.nextDouble();
		bankAccount obj = new bankAccount(number,name,balance);
		
		
		
		System.out.println("depost Amount:");
		double deposit = sc.nextDouble();
		obj.deposit(deposit);
		System.out.println("Amount withdrawl:");
		double withdrawl = sc.nextDouble();
		obj.withdraw(withdrawl);
		
		
	

	}

}
