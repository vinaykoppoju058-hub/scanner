package com.scanner;
import java.util.Scanner;
public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner obj =new Scanner(System.in);
		
		System.out.println("enter employee ID:");
		int empID=obj.nextInt();
		
		System.out.println("enter employee Name:");
		String empName=obj.next();
		System.out.println("enter employee salary:");
		double BasicSalary=obj.nextDouble();
		
		
		double hra = BasicSalary * 20 / 100;
		double da = BasicSalary * 10/100;
		
		double grosssalary = BasicSalary+hra+da;
		
		
		System.out.println("Employee Details-->");
		System.out.println("------------");
		System.out.println("enter employee ID:"+empID);
		System.out.println("enter employee name:"+empName);
		System.out.println("Basic salary:"+BasicSalary);
		System.out.println("Gross salary:"+grosssalary);
	}

}
