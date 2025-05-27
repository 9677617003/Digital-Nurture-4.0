import java.util.*;
public class FactorialCalculator 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int number = sc.nextInt();
if (number >= 0)
{
long f = 1;
for (int i = 1; i <= number; i++)
{
f *= i;
}
System.out.println(f);
}
else
{
System.out.println("Invalid input. Please enter a non-negative number.");
}
}
}
