package javaprogram;
import java.util.Scanner;
public class Employee {
	String name;
	int age;
	float salary;
	Scanner s;
	void add()
	{
		s= new Scanner(System.in);
		System.out.println("\n Enter the name of Employee = ");
		name= s.next();//take string as input from user
		System.out.println("\n Enter the age of Employee = ");
		age= s.nextInt();
		System.out.println("\n Enter the salary of Employee = ");
		salary= s.nextFloat();
	}
	void display()
	{
		System.out.println("\n Name of Employee = "+name +"\n Age of Employee "+ age+"\n Salary of Employee "+salary);
	}
	public static void main(String[] args) {
	   Employee e= new Employee();
	   e.add();
	   e.display();
	   Employee e1= new Employee();
	   e1.add();
	   e1.display();
	}
}
