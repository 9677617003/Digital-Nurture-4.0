import java.util.*;
import java.util.Random;
public class NumberGuessingGame
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random a = new Random();
int n = a.nextInt(100) + 1;
int guess = 0;
System.out.println("Choose number between 1 and 100.");
while (guess != n)
{
guess = sc.nextInt();
if (guess < n)
{
System.out.println("Too low");
}
else if (guess > n)
{
System.out.println("Too high");
}
else
{
System.out.println("Congratulations! You guessed the number!");
}
}
}
}
