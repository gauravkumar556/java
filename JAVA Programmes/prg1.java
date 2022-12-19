import java.util.Scanner;
class A{
	 public static void main(String[] args)
{
	StringBuffer s1=new StringBuffer("Welcome");
	int p=s1.length();
	s1.append("\tTo \tour\tCollege");
	s1.insert(7,"\t");
	System.out.println(""+s1);

	System.out.println("Length of string is: "+p);
	System.out.println(s1);

	
}	
}
