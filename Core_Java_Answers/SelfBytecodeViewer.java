import java.io.*;
import java.nio.file.*;
public class SelfBytecodeViewer {
public static void main(String[] args) throws Exception {
String code = """
public class Hello {
public static void main(String[] args) {
int result = add(2, 3);
System.out.println("Result: " + result);
}
public static int add(int a, int b) {
return a + b;
}
}
""";
Files.writeString(Path.of("Hello.java"), code);
System.out.println("[INFO] Java source file created.");
Process compile = new ProcessBuilder("javac", "Hello.java")
.inheritIO()
.start();
compile.waitFor();
System.out.println("[INFO] Compilation finished.");
System.out.println("\n=== Bytecode Output (javap -c Hello) ===");
Process javap = new ProcessBuilder("javap", "-c", "Hello")
.redirectErrorStream(true)
.start();
try (BufferedReader reader = new BufferedReader(new InputStreamReader(javap.getInputStream()))) {
String line;
while ((line = reader.readLine()) != null)
System.out.println(line);
}
javap.waitFor();
}
}
