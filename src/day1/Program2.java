package day1;

import java.util.Scanner;

public class Program2
{
  //Wap to check whether the given is divisible by 3 and 5 
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int input=sc.nextInt();
		
		if(input%3==0 && input%5==0)
		{
			System.out.println("Yes,The given number "+input+" is divisible by 3 and 5");
		}
		else
		{
			System.out.println("No,The given number "+input+" is not by 3 and 5");
		}
	}
}
