package javaprogram;
import java.util.Scanner;
public class Grading {

	public static void main(String[] args) 
	{
		String name;
		int marks;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Student name");
		name=s.next();
		System.out.println("Enter Student's marks");
		marks=s.nextInt();
		
		if(marks>=80)  			System.out.println(" A Grade");
		else if(marks>=70)    	System.out.println(" B Grade");
		else if(marks>=60)		System.out.println(" c Grade");
		else          			System.out.println(" D Grade");
		
	}

}
