package loop;
import java.util.Scanner;
public class PrintNumberTillUserWant {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int i,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number till you want to print");
        num=sc.nextInt();
        if(num>=1) 
    	{
           for(i=1;i<=num;i++)
           {
        	   System.out.println(i);
           }
    	}
        	
        else if(num==0) 
        	{
        		System.out.println("Enter positive interger number");
        	}

        	else
        	{
        		System.out.println("Invalide number \nEnter Positive number ");
        	}
	}
}
