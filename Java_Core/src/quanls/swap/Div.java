package quanls.swap;

public class Div {
  public static void main(String[] args) {
    double a = 6986;
    double b = 98133;

    System.out.println("Before swap");
    System.out.println("a = " + a + " ; " + "b = " + b + "\n");

    a = a / b;
    b = a * b;
    a = b / a;

    System.out.println("After swap");
    System.out.println("a = " + a + " ; " + "b = " + b);
  }
}
