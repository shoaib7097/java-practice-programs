package day1;

import java.util.Scanner;

public class Program3 
{
	//Wap to check the given number is multiple of 2 and 5 and 10
   public static void main(String[] args) 
   {
	/*whenever we are solving any question first we need to check the input and output 
	 * like here first we have to think which is the first number which will be multiple of all three numbers
	 * ex=The first number is 10 than after that 20,30,40 so on.here we can observe that the number which are multiple
	 * of 10 is also multiple of both 5 and 10 so we no need to write multiple conditions only with one condition 
	 * we can solve it  */
	   
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a number");
	  int input=sc.nextInt();
	  
	  if(input%10==0)
	  {
		  System.out.println("The given number "+input+" is multiple of 2,5 and 10");
	  }
	  else
	  {
		  System.out.println("The given number "+input+" is not multiple of 2,5 and 10");
	  }
   }
}
