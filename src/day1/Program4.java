package day1;

import java.util.Scanner;

public class Program4 
{
	//write a program to print 'yes' if the given number is ending with 0 otherwise print 'No'
	//Note=Here the logic is If you divide any number by 10 the remainder will be last digit of the number ex=1254%10 the rem will be 4
	
  public static void main(String[] args)
  {
	     Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter a number");
		 int input=sc.nextInt();
		 
		 if(input%10==0)//if you get question to check the number is ending by 'n' number than condition will be given_number%10==n
		 {
			 System.out.println("Yes,The given number "+input+" is ending with zero");
		 }
		 else
		 {
			 System.out.println("No,The given number "+input+" is not ending with zero");
		 }
  }
}
