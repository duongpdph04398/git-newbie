package quanls.squarenumber;

public class SquareNumber {
  // Check square number from 1 to 100
  public static void main(String[] args) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i * i);
    }
    System.out.println(checkSquareNumber(4));
  }

  public static boolean checkSquareNumber(double i) {
    if ((Math.sqrt(i)) % 1 == 0) {
      return true;
    }
    return false;
  }
}
