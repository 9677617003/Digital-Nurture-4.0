public class PatternMatchingSwitch {
public static void main(String[] args) {
printObjectType("Hello, Java");
printObjectType(42);
printObjectType(3.14);
printObjectType(true);
printObjectType(null);
}
public static void printObjectType(Object obj) {
String result = switch (obj) {
case Integer i -> "It's an Integer: " + i;
case String s -> "It's a String: " + s;
case Double d -> "It's a Double: " + d;
case Boolean b -> "It's a Boolean: " + b;
case null -> "It's null!";
default -> "Unknown type: " + obj;
};
System.out.println(result);
}
}
