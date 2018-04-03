package java8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Futurer {

  public static void main(String[] args)
      throws InterruptedException, ExecutionException, TimeoutException {

    long start = System.currentTimeMillis();
    testCompletableFuture(3, 5, 7);
    System.out.printf("All done after %d seconds\n",
        (System.currentTimeMillis() - start) / 1000);
  }

  public static void testFuture(int s1, int s2, int s3)
      throws InterruptedException, ExecutionException, TimeoutException {
    ExecutorService service = Executors.newCachedThreadPool();

    Future<String> f1 = service.submit(() -> {
      return doLongTask(s1);
    });
    Future<String> f2 = service.submit(() -> {
      return doLongTask(s2);
    });
    Future<String> f3 = service.submit(() -> {
      return doLongTask(s3);
    });
    System.out.println(f1.get(5, TimeUnit.SECONDS));
    System.out.println(f2.get(5, TimeUnit.SECONDS));
    System.out.println(f3.get(5, TimeUnit.SECONDS));

    service.shutdown();
  }

  public static void testCompletableFuture(int s1, int s2, int s3)
      throws InterruptedException, ExecutionException, TimeoutException {

    CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
      return doLongTask(s1);
    });
    CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
      return doLongTask(s2);
    });
    CompletableFuture<String> f3 = CompletableFuture.supplyAsync(() -> {
      return doLongTask(s3);
    });
    f1.thenAccept(result -> {
      System.out.println(result);
    });
    f2.thenAccept(result -> {
      System.out.println(result);
    });
    f3.thenAccept(result -> {
      System.out.println(result);
    });

  }

  public static String doLongTask(int number) {
    try {
      Thread.sleep(number * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return "Done task after " + number + " seconds";
  }

}
