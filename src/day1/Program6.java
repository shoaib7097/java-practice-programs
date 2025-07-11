package day1;

import java.util.Scanner;

public class Program6 
{
  public static void main(String[] args) 
  {
	//Wap to eliminate last 2 digit of given number ex input 1567 than output should be 15
	  
	     Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter a number");
		 int input=sc.nextInt();
		 
		 int afterEliminate=input/100;
		 System.out.println("Given number "+input+" after eliminate the last two digit "+afterEliminate);
		 
  }
}
