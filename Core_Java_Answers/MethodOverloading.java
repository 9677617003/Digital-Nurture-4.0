import java.util.*;
public class MethodOverloading 
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = a + b;
System.out.println("Sum of two integers: " + c);
double x = sc.nextDouble();
double y = sc.nextDouble();
double z = x + y;
System.out.println("Sum of two doubles: " + z);
int p = sc.nextInt();
int q = sc.nextInt();
int r = sc.nextInt();
int s = p + q + r;
System.out.println("Sum of three integers: " + s);
}
}
