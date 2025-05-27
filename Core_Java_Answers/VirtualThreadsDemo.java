import java.time.Duration;
import java.time.Instant;
public class VirtualThreadsDemo {
public static void main(String[] args) throws InterruptedException {
int totalThreads = 100_000;
System.out.println("Starting " + totalThreads + " virtual threads...");
Instant start = Instant.now();
Thread[] threads = new Thread[totalThreads];
for (int i = 0; i < totalThreads; i++) {
int threadNumber = i;
threads[i] = Thread.startVirtualThread(() -> {
System.out.println("Hello from virtual thread " + threadNumber);
});
}
for (Thread t : threads) {
t.join(); // Wait for all to complete
}
Instant end = Instant.now();
System.out.println("All threads finished in: " + Duration.between(start, end).toMillis() + " ms");
}
}
