import java.util.*;
public class TryCatchExample 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
try 
{
int numerator = scanner.nextInt();
int denominator = scanner.nextInt();
int result = numerator / denominator;
System.out.println(result);
} 
catch (ArithmeticException e) 
{
System.out.println("Error: Cannot divide by zero.");
}
catch (Exception e) 
{
System.out.println("Error: Invalid input.");
} 
finally 
{
scanner.close(); 
}
}
}
