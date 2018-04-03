package quanls.swap;

public class Plus {
  public static void main(String[] args) {
    int a = 6986;
    int b = 98133;

    System.out.println("Before swap");
    System.out.println("a = " + a + " ; " + "b = " + b + "\n");

    a = a - b;
    b = b + a;
    a = b - a;

    System.out.println("After swap");
    System.out.println("a = " + a + " ; " + "b = " + b);
  }
}
