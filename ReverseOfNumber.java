package array;

import java.util.Scanner;

public class ReverseOfNumber 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int number,reverse= 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number and display it reverse");
		number=sc.nextInt();
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}  		
} 