package com.scanner;
import java.util.Scanner;
public class Students {
	 String name;
	    int javaMarks, sqlMarks, webMarks;

	    Students(String name, int javaMarks, int sqlMarks, int webMarks) {
	        this.name = name;
	        this.javaMarks = javaMarks;
	        this.sqlMarks = sqlMarks;
	        this.webMarks = webMarks;
	    }

	    void result() {

	        int total = javaMarks + sqlMarks + webMarks;
	        double percentage = total / 3.0;

	        System.out.println("Name : " + name);
	        System.out.println("Total : " + total);
	        System.out.println("Percentage : " + percentage);
	    }
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Name : ");
	        String name = sc.nextLine();

	        System.out.print("Java Marks : ");
	        int java = sc.nextInt();

	        System.out.print("SQL Marks : ");
	        int sql = sc.nextInt();

	        System.out.print("Web Marks : ");
	        int web = sc.nextInt();

	        Students s = new Students(name, java, sql, web);

	        System.out.println();
	        s.result();

	        sc.close();
	    }
}
