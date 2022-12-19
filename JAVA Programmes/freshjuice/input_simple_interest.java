package Cal_Simple_Interest;   //package name
import java.io.*;                           //module import
public class  input_simple_interest                                //class name
{
 public static void main(String[] args)                       //main fuction declaration
 {
      float s_i,p,r,t;
       
      try{
             System.out.println("Enter the value of p,r,t :");
	BufferedReader br=new BufferedReader(new  InputStreamReader(System.in));
	p=Float.parseFloat(br.readLine());
	t=Float.parseFloat(br.readLine());
	r=Float.parseFloat(br.readLine());
	s_i=(p*r*t)/100;
System.out.println("Simple interest is %f",s_i);
	
           }
      catch(IOException e)
	{
	 System.out.println("Error in Input");
    	}
 }
}