package sort;

public class SelectionSort {

  public static void main(String[] args) {
    int temp;
    int[] arr = { 5, 4, 6, 1 };
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if(arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

}
