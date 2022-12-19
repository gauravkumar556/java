import java.util.*;
import java.util.Scanner;
class A{
public static int DigitSquare(int num){
	int sum=0;
	int rem;
	while(num>0)
	{
		rem=num%10;
		sum=rem*rem+sum;
		num=num/10;
		
	}
	return sum;
	}
static boolean Happy(int num){
	if(num<=0)
	{
		return false;
	}
	else
	{
		while(!(num ==1 || num==4))
		{
			num=DigitSquare(num);
		}
	}
	return num==1;
	}
public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();

		if(Happy(num)){
			System.out.println(num+"is a happy number");
		}
		else{
			System.out.println(num+"is not a happy number");
		}
	}
}