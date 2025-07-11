package day1;

import java.util.Scanner;

public class Program1 
{
   //Wap to check whether the given number is divisible by two or not
   //Wap to check whether the given number is multiple of two or not 
   //Wap to check whether the given number is divisible by two or not
	
	
	public static void main(String[] args) 
	{
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter a number");
		 int input=sc.nextInt();
		 
		 if(input%2==0)
		 {
			 System.out.println("Yes the given number "+input+" is divisible by 2");
		 }
		 else
		 {
			 System.out.println("No the given number "+input+" is not divisible by 2");
		 }
	}
}
