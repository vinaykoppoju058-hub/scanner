package com.scanner;
import java.util.Scanner;
public class student {
	 int id;
	    String name;

	    student(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    void display() {
	        System.out.println("Student Id   : " + id);
	        System.out.println("Student Name : " + name);
	    }
	


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Student Id : ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Student Name : ");
	        String name = sc.nextLine();

	        student s = new student(id, name);

	        System.out.println("\nStudent Details");
	        s.display();

	        sc.close();
	    }
}
