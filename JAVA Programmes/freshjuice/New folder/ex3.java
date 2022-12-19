// GCD of two number
import java.util.*;
import java.util.Scanner;

class GCD{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :");
		num1=sc.nextInt();
		System.out.println("Enter second number :");
		num2=sc.nextInt();
		
		int GCD=GCDoftwonumbers(num1,num2);
		System.out.println(""+GCD);
	}
	public static int GCDoftwonumbers(int num1,int num2)
		{
		 	if(num1!=num2)
			 {
	    			if(num1>num2)
					num1=num1-num2;	
	    			else		
	  				num2=num2-num1;   	
	    			return GCDoftwonumber(num1,num2);
			}
			return num1;   
		}
				
}
