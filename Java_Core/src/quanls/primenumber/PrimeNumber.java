package quanls.primenumber;

public class PrimeNumber {
  public static void main(String[] args) {
    boolean isPrime;
    for (int i = 2; i < 10; i++) {
      isPrime = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime)
        System.out.println(i);
    }
  }

  public static boolean checkPrime(int number) {
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
