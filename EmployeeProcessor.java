package com.scanner;

import java.util.Scanner;

import com.constructor.employee;

public class EmployeeProcessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter employee ID:");
		int empID=sc.nextInt();
		System.out.println("Enter Employee Name:");
		String empName=sc.next();
		System.out.println("Enter your salary:");
		double empSal=sc.nextDouble();
		System.out.println("enter designation");
		String desg=sc.next();
		System.out.println("enter emp location");
		String emploc=sc.next();
		System.out.println("enter Rating:");
		int Rating=sc.nextInt();
		employee emp=new employee(empID,empName,empSal,desg,emploc,Rating);
		
		
		System.out.println("======================================");
		System.out.println("Promote Employeee");
		emp.promoteEmployee();
	}

}
