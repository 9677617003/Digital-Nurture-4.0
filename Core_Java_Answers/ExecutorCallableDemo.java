import java.util.concurrent.*;
import java.util.*;
public class ExecutorCallableDemo {
public static void main(String[] args) throws Exception {
ExecutorService executor = Executors.newFixedThreadPool(3);
List<Callable<String>> tasks = new ArrayList<>();
for (int i = 1; i <= 5; i++) {
int taskNum = i;
tasks.add(() -> {
Thread.sleep(1000); // Simulate work
return "Result from task " + taskNum;
});
}
List<Future<String>> futures = new ArrayList<>();
for (Callable<String> task : tasks) {
futures.add(executor.submit(task));
}
for (Future<String> future : futures) {
System.out.println(future.get());
}
executor.shutdown();
}
}
