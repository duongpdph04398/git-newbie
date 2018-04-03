package quanls.swap;

public class Bit {
  public static void main(String[] args) {
    int a = 12312312;
    int b = 456436;

    System.out.println("Before swap");
    System.out.println("a = " + a + " ; " + "b = " + b + "\n");

    a = a ^ b;
    b = a ^ b;
    a = b ^ a;

    System.out.println("After swap");
    System.out.println("a = " + a + " ; " + "b = " + b);
  }
}
