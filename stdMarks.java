package com.scanner;
import java.util.Scanner;
public class stdMarks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter java Marks:");
		int java = sc.nextInt();
		
		System.out.println("enter SQl Marks:");
		int sql = sc.nextInt();
		
		System.out.println("enter HTML Marks:");
		int html = sc.nextInt();
		
		System.out.println("enter CSS Marks:");
		int css = sc.nextInt();
		
		System.out.println("enter JAVA SCRIPT Marks:");
		int javascript = sc.nextInt();
		
		
		int totalmarks = java+sql+html+css+javascript;
		
		double Average = totalmarks /5.0;
		
		double percentage =  (totalmarks/500.0)*100;
		
		
		System.out.println("Total Marks:"+totalmarks);
		System.out.println("Average:"+Average);
		System.out.println("Percentage:"+percentage+"%");
	}

}
