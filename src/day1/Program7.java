package day1;

import java.util.Scanner;

public class Program7 
{
  //Wap to check the given number is two digit or not 
	
	public static void main(String[] args) 
	{
         Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter a number");
		 int input=sc.nextInt();
		 
		 if(input>9 && input<100)
		 {
			 System.out.println("Yes,The given number "+input+" is two digit number");
		 }
		 else
		 {
			 System.out.println("No,The given number "+input+" is not two digit number");
		 }
	}
}
