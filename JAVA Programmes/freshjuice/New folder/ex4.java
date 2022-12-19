import java.util.*;
//Reverse of a number
import java.util.Scanner;
class Main{
public static int ReverseofNum(int num){
	int rem=0;
	int rev=0;
	while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
	return rev;	
}


public static void main(String args[])
{	int num;
	int rev;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	num=sc.nextInt();
	rev=ReverseofNum(num);
	System.out.println(""+rev);
	
}

}
