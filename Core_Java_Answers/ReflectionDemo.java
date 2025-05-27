import java.lang.reflect.*;
public class ReflectionDemo {
public static void main(String[] args) {
try {
Class<?> clazz = Class.forName("Sample");
System.out.println("Class: " + clazz.getName());
Method[] methods = clazz.getDeclaredMethods();
for (Method method : methods) {
System.out.print("Method: " + method.getName() + "(");
Class<?>[] paramTypes = method.getParameterTypes();
for (int i = 0; i < paramTypes.length; i++) {
System.out.print(paramTypes[i].getSimpleName());
if (i < paramTypes.length - 1) System.out.print(", ");
}
System.out.println(")");
}
Object obj = clazz.getDeclaredConstructor().newInstance();
Method greetMethod = clazz.getDeclaredMethod("greet", String.class);
greetMethod.invoke(obj, "World");
} 
catch (Exception e) {
e.printStackTrace();
}
}
}
class Sample {
public void greet(String name) {
System.out.println("Hello, " + name + "!");
}
public int add(int a, int b) {
return a + b;
}
}
