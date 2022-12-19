package Addition;
import java.io.*;
public class add{
public static void main(String[] args)
{
	float add;
	float number1;
	float number2;
 	try{
	 System.out.println("Enter first number :");
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 number1=Float.parseFloat(br.readLine());
	 System.out.println("Enter second number :");
	 //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 number2=Float.parseFloat(br.readLine());
 	 add=number1+number2;
	 System.out.printf("Addition of two number is %f",+add);
	} 
	catch(IOException e){
	 System.out.println("Error Input");
	}
}
}