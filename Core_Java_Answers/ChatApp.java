import java.io.*;
import java.net.*;
public class ChatApp {
public static void main(String[] args) {
boolean isServer = false; 
int port = 12345;
String host = "localhost";
try {
if (isServer) {
runServer(port);
} 
else {
runClient(host, port);
}
} catch (IOException e) {
e.printStackTrace();
}
}
public static void runServer(int port) throws IOException {
ServerSocket serverSocket = new ServerSocket(port);
System.out.println("Server started. Waiting for client...");
Socket socket = serverSocket.accept();
System.out.println("Client connected.");
chat(socket);
socket.close();
serverSocket.close();
}
public static void runClient(String host, int port) throws IOException {
Socket socket = new Socket(host, port);
System.out.println("Connected to server.");
chat(socket);
socket.close();
}
public static void chat(Socket socket) throws IOException {
BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
Thread receive = new Thread(() -> {
String msg;
try {
while ((msg = input.readLine()) != null) {
System.out.println(">> " + msg);
if (msg.equalsIgnoreCase("exit")) break;
}
} catch (IOException e) {
System.out.println("Connection closed.");
}});
Thread send = new Thread(() -> {
String msg;
try {
while ((msg = console.readLine()) != null) {
output.println(msg);
if (msg.equalsIgnoreCase("exit")) break;
}
} catch (IOException e) {
System.out.println("Error sending message.");
}
});
receive.start();
send.start();
try {
receive.join();
send.join();
} 
catch (InterruptedException e) {
e.printStackTrace();
}
System.out.println("Chat ended.");
}
}
