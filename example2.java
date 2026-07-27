package com.scanner;
import java.util.Scanner;
public class example2 {

	public static void main(String[] args) {
		
		int attempt =0;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter user name:");
		String user=sc.next();
		
		System.out.println("enter password:");
		String pass=sc.next();
		
		
		
		if(user.equals("vinay@123") && pass.equals("vinay123")){
			System.out.println("login success:");
			break;
		}else {
			attempt++;										
			System.out.println("you have"+(3-attempt)+"attempts left");
		}
		
		}while(attempt < 3);
		
		if (attempt == 3) {
			System.out.println("try after 24 hrs");
		}
	}
	

}
