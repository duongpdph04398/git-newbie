public class TestJavaTheory {

  int a = 0;

  public static void main(String[] args) {
    try {
      badMethod();
      System.out.print("A");
    } catch (RuntimeException re) {
      System.out.print("B");
    } catch (Exception e) {
      System.out.print("C");
    } finally {
      System.out.print("D");
    }
    System.out.print("E");
  }

  public static void badMethod() {
    throw new RuntimeException();
  }

}
