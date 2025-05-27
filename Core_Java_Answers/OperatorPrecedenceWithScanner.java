import java.util.Scanner;
public class OperatorPrecedenceWithScanner {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
int b = scanner.nextInt();
int c = scanner.nextInt();
int d = scanner.nextInt();
int x1 = a + b * c - d;
System.out.println("x1 : " + x1);
int x2 = (a + b) * (c - d);
System.out.println("x2 : " + x2);
int x3 = a + b / c + d;
System.out.println("x3 : " + x3);
int x4 = a * b % c + d;
System.out.println("x4 : " + x4);
int x5 = a;
x5 += b * c - d;
System.out.println("x5 : " + x5);
}
}
