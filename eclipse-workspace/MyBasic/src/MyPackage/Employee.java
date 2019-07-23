package MyPackage;

import java.io.*;
import java.util.Scanner;
public class Employee {

	String name;
	int age;
	String designation;
	double salary;
	
	public Employee(String name)
	{
		this.name=name;
	}
	public Employee(String name,int empAge,String empDesig,double empSalary)
	{
		this.name=name;
		age = empAge;
		designation = empDesig;
		salary = empSalary;
	}
	public void empAge()
	{
		Scanner in =new Scanner(System.in);
		System.out.print("Enter Age:");
		age = in.nextInt();
		in.close();
	}
	public void empDesignation()
	{
		Scanner in =new Scanner(System.in);
		System.out.print("Enter Designation:");
		designation = in.nextLine();
		in.close();
	}
	public void empSalary()
	{
		Scanner in =new Scanner(System.in);
		System.out.print("Enter Salary:");
		salary = in.nextDouble();
		in.close();
	}
	
	public void print()
	{
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Designation :" + designation);
		System.out.println("Salary :" + salary);
	}
}
