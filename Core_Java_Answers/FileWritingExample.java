import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWritingExample 
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
try 
{
System.out.print("Enter text to write to file: ");
String userInput = scanner.nextLine();
FileWriter writer = new FileWriter("output.txt");
writer.write(userInput);
writer.close();
System.out.println("Data has been written to output.txt");
} 
catch (IOException e) 
{
System.out.println("An error occurred while writing to the file: " + e.getMessage());
} 
finally 
{
scanner.close(); }
}
}
