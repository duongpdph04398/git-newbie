package quanls.swap;

public class Minus {
  public static void main(String[] args) {
    int a = 6986;
    int b = 98133;

    System.out.println("Before swap");
    System.out.println("a = " + a + " ; " + "b = " + b + "\n");

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("After swap");
    System.out.println("a = " + a + " ; " + "b = " + b);
  }
}
