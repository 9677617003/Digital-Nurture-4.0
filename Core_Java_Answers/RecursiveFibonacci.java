import java.util.*;
public class RecursiveFibonacci
{
public static int fibonacci(int n)
{
if (n <= 1)
{
return n; 
}
else
{
return fibonacci(n - 1) + fibonacci(n - 2); 
}
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
if (n > 0)
{
int result = fibonacci(n);
System.out.println(result);
}
}
}
