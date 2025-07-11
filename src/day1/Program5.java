package day1;

import java.util.Scanner;

public class Program5 
{
  //Wap to check the given number is ending with '53' or not 
	
  //note here the logic is whichever number you divide with 100 the remainder will the last two digit of that number ex 10233%100 the rem will be 33
	 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter a number");
		 int input=sc.nextInt();
		 
		 if(input%100==53)//if the question is check the last 3 digit number ending with nnn than the logic would be given_number%1000==nnn 
		 {
			 System.out.println("Yes,The given number "+input+" is ending with 53");
		 }
		 else
		 {
			 System.out.println("No,The given number "+input+" is ending with 53");
		 }
	}
}
