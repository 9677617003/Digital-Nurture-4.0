import java.util.*;
public class ModularDemo {
    public static void main(String[] args) {
        System.out.println(StringUtils.shout("hello from modules"));
    }
}

// Simulating com.utils.StringUtils
class StringUtils {
    public static String shout(String msg) {
        return msg.toUpperCase() + "!";
    }
}
