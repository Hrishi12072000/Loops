package loop;

import java.util.Scanner;

public class PrintSentenceNTimes 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int i,num;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the number till you want to print");
	     num=sc.nextInt();
	     for(i=1;i<=num;i++)
	     {
	    	 System.out.println(i);
	     }
	}
}
