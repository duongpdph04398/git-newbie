package quanls.primenumber;

public class Prime {
  // Check primes from 1 to 100
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          System.out.println(i + " isn't prime.\t" + j);
          break;
        }
      }
    }
  }
}
