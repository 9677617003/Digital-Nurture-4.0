import java.util.*;
public class ArraySumAndAverage
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] numbers = new int[n];
for (int i = 0; i < n; i++)
{
numbers[i] = sc.nextInt();
}
int sum = 0;
for (int num : numbers) {
sum += num;
}
double average = (double) sum / n;
System.out.println("Sum: " + sum);
System.out.println("Average: " + average);
}
}
