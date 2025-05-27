import java.util.*;
class InvalidAgeException extends Exception {
public InvalidAgeException(String message) {
super(message);
}
}
public class CustomExceptionExample {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
System.out.print("Enter your age: ");
int age = scanner.nextInt();
if (age < 18) 
{
throw new InvalidAgeException("You must be at least 18 years old.");
}
System.out.println("Access granted. You are eligible.");
}
catch (InvalidAgeException e) {
System.out.println("Access denied: " + e.getMessage());
}
catch (Exception e) 
{
System.out.println("Invalid input.");
}
finally 
{
scanner.close(); 
}
}
}
