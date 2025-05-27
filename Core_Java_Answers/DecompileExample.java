import java.io.*;
import java.nio.file.*;
public class DecompileExample {
public static void main(String[] args) throws Exception {
String sourceCode = """
public class Hello {
public static void main(String[] args) {
System.out.println("Hello, Decompiler!");
}
}
""";
Files.writeString(Path.of("Hello.java"), sourceCode);
System.out.println("[INFO] Source file Hello.java created.");
Process compile = new ProcessBuilder("javac", "Hello.java").inheritIO().start();
compile.waitFor();
System.out.println("[INFO] Compiled Hello.class.");
Path cfrJar = Path.of("cfr.jar");
if (!Files.exists(cfrJar)) {
System.out.println("[INFO] Downloading CFR decompiler...");
try (InputStream in = new java.net.URL("https://www.benf.org/other/cfr/cfr-0.152.jar").openStream()) {
Files.copy(in, cfrJar);
}
System.out.println("[INFO] CFR downloaded as cfr.jar");
}
System.out.println("\n=== Decompiled Code (CFR) ===");
Process decompile = new ProcessBuilder("java", "-jar", "cfr.jar", "Hello.class")
.redirectErrorStream(true)
.start();
try (BufferedReader reader = new BufferedReader(new InputStreamReader(decompile.getInputStream()))) {
String line;
while ((line = reader.readLine()) != null)
System.out.println(line);
}
decompile.waitFor();
}
}
