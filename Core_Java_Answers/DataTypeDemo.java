import java.util.Scanner;
public class DataTypeDemo
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
int i = input.nextInt();
float f = input.nextFloat();
double d = input.nextDouble();
char c = input.next().charAt(0);
boolean b = input.nextBoolean();
System.out.println("Integer value: " + i);
System.out.println("Float value: " + f);
System.out.println("Double value: " + d);
System.out.println("Character value: " + c);
System.out.println("Boolean value: " + b);
}
}
