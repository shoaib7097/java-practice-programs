package day1;

import java.util.Scanner;

public class Program6 
{
	//Wap to eliminate last 2 digit of given number ex input 1567 than output should be 15
	/*Note here the logic I used is for example if I divide a number by 100 the quotient  will be before the last two digit 
	 * ex=1984 than quotient will be 19 last two digits are eliminated likewise if you want to eliminate 3 number than
	 * the logic would be given_number/1000
	 */
  public static void main(String[] args) 
  {
	
	     Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter a number");
		 int input=sc.nextInt();
		 
		 int afterEliminate=input/100;
		 System.out.println("Given number "+input+" after eliminate the last two digit "+afterEliminate);
		 
  }
}
