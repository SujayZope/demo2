package javaprogram;
import java.util.Scanner;
public class Ternaryop 
{
	int marks;
	void input()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Marks ");
		marks= s.nextInt();
	}
	void display()
	{
		String result=marks>=40 ? "Pass"  :"Fail";
	    System.out.println(result);
	}
	public static void main(String[] args) 
	{
		Ternaryop t= new Ternaryop();
		   t.input();
		   t.display();  
	}

}
