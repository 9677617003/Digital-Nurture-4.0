import java.util.*;
public class simple_java_calculator
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),m=sc.nextInt();
char op = sc.next().charAt(0);
if(op=='+')
{
System.out.print(n+m);
}
else if(op=='-')
{
System.out.print(n-m);
}
else if(op=='*')
{
System.out.print(n*m);
}
else if(op=='/')
{
if(m!=0)
{
System.out.print(n/m);
}
else
{
System.out.println("Cannot divide by zero.");
}
}
else
{
System.out.print("Invalid Operator");
}
}
}