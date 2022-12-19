import java.util.*;
import java.util.Scanner;
class Prime{
	public static void main(String[] args)
	{
		int i;
		System.out.println("Enter any number :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if (numisPrime(num))
		{
			System.out.println(num +" is a prime no");
			}
		else
			{
			System.out.println( num +" is not a prime no");
			
			}
		}
	
  		public static boolean numisPrime(int num)
		{	
		for( int i=2;i<num;i++)
		{
			if (num%i==0)
               			{
			return false;
			}	
		}
   		return true;
		}
		
	
}

			