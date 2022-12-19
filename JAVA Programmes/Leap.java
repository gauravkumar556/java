import java.util.*;
import java.util.Scanner;
class Leap{
	public static void main(String[] args)
	{
		int i;
		System.out.println("Enter any year :");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		if (yearisLeap(year))
		{
			System.out.println(year +" is a Leap Year");
			}
		else
			{
			System.out.println( year +" is not a Leap year");
			
			}
		}
	
  		public static boolean yearisLeap(int year)
		{	
			if (year%400==0 || (year%4==0 && year%100!=0))
               			{
			return true;
			}	
   		return false;
		}
		
	
}
