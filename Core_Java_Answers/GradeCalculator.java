import java.util.*;
public class GradeCalculator
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
if(n>0 || n<100)
{
if(n>=90 && n<=100)
{
System.out.print("A");
}
else if(n>=80 && n<=89)
{
System.out.print("B");
}
else if(n>=70 && n<=79)
{
System.out.print("C");
}
else if(n>=60 && n<=69)
{
System.out.print("D");
}
else
{
System.out.print("F");
}
}
else
{
System.out.print("Invalid Mark");
}
}
}
