package day1;

import java.util.Scanner;

public class Program4 
{
	//write a program to print 'yes' if the given number is ending with 0 otherwise print 'No'
	
  public static void main(String[] args)
  {
	  Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter a number");
		 int input=sc.nextInt();
		 
		 if(input%10==0)
		 {
			 System.out.println("Yes,The given number "+input+" is ending with zero");
		 }
		 else
		 {
			 System.out.println("No,The given number "+input+" is not ending with zero");
		 }
  }
}
