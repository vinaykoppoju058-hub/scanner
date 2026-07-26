package com.scanner;

public class employee {
	private int employee_id;
	private String employee_name;
	private double Salary;
	private String desg;
	private int rating;
	private String location;
	public employee(int employee_id, String employee_name,double Salary,String desg,String location,int rating) {
		this.employee_id =employee_id;
		this.employee_name=employee_name;
		this.Salary=Salary;
		this.desg=desg;
		this.rating = rating;
			
	}
	public void setloc(String location) {
		this.location = location;
	}
	public String getlocation() {
		return location;
	}


	public void setDesg(String desg) {
		this.desg = desg;
	}

	public void setSalary(int Salary) {
		this.Salary = Salary;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public String getEmployee_name() {
		return employee_name;
	}
	public double getSalary() {
        return Salary;
    }

	public String getDesg() {
		return desg;
	}

	public int getRating() {
		return rating;
	}
	
	public void promoteEmployee() {
		if (rating>=4) {
			double promote = Salary+Salary*20/100;
			System.out.println("After promotion");
			System.out.println("updated salary:"+promote);
			System.out.println("Designation:senior Developer");
			 System.out.println("promote to next level");
		}else {
			System.out.println("no promotion");
	}
	}
	public static void main(String[] args) {

	}

}
