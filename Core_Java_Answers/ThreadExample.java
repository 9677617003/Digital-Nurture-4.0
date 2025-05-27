class MessagePrinter implements Runnable 
{
private String message;
public MessagePrinter(String message) 
{
this.message = message;
}
public void run() 
{
for (int i = 1; i <= 5; i++) 
{
System.out.println(message + " - " + i);
try 
{
Thread.sleep(500); 
} 
catch (InterruptedException e) 
{
System.out.println("Thread interrupted");
}
}
}
}
public class ThreadExample 
{
public static void main(String[] args) 
{
Runnable printer1 = new MessagePrinter("Thread A");
Runnable printer2 = new MessagePrinter("Thread B");
Thread thread1 = new Thread(printer1);
Thread thread2 = new Thread(printer2);
thread1.start();
thread2.start();
}
}
