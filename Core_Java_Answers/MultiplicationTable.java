import java.util.Scanner;
public class MultiplicationTable
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n =sc.nextInt(),i;
System.out.println("Multiplication table for " + n + ":");
for (i = 1; i <= 10; i++)
{
System.out.println(n + " x " + i + " = " + (n * i));
}
}
}
