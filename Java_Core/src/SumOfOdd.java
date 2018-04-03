
public class SumOfOdd {
  static int sum = 0;
  public static void main(String[] args) {
    System.out.println(increment(100));
  }
  
  public static int increment(int count) {
    if(count < 100) {
      increment(count);
    }
    return count;
  }
}
