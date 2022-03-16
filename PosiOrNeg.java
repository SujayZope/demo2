package javaprogram;
import java.util.Scanner;
public class PosiOrNeg
{
		int num;
		void input()
		{
			Scanner s= new Scanner(System.in);
			System.out.println("Enter the number to check positive or negative = ");
			num= s.nextInt();
		}
		void display()
		{
			String result=num>0 ? "Positive number"  :"Negative number";
		    System.out.println(result);
		}
		public static void main(String[] args) 
		{
			PosiOrNeg p= new PosiOrNeg();
			   p.input();
			   p.display();
			     
		}

}
