import java.util.*;
public class PalindromeChecker
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
String input = scanner.nextLine();
String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
boolean isPalindrome = isPalindrome(cleaned);
if (isPalindrome)
{
System.out.println("The string is a palindrome.");
}
else
{
System.out.println("The string is NOT a palindrome.");
}
}
public static boolean isPalindrome(String str) {
int left = 0;
int right = str.length() - 1;
while (left < right)
{
if (str.charAt(left) != str.charAt(right)) {
return false;
}
left++;
right--;
}
return true;
}
}
