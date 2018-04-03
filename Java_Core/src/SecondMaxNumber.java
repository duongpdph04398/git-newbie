public class SecondMaxNumber {
  public static void main(String[] args) {
    int[] arr = { 7, 3, 7, 8 };
    int max = 0;
    int secondMax = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        secondMax = max;
        max = arr[i];
      }
    }
    System.out.println("Max: " + max);
    System.out.println("Second max: " + secondMax);
  }
}
