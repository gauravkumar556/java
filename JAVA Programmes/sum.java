class Sum{
int sum;
public void Add(int first,int second){

sum=first+second;
System.out.println(sum);
}
}
class Number extends Sum{
public static void main(String[] args)
{

int first=64;
int second=36;
Number n1=new Number();
n1.Add(first,second);

}
}