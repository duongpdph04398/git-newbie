package sort;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = { 3, 2, 8, 5, 1 };
    int temp, j;
    for (int i = 1; i < arr.length; i++) {
      j = i - 1;
      temp = arr[i];
      while(j > -1 && arr[j] > temp) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = temp;
    }
    for (int index : arr) {
      System.out.print(index + " ");
    }
  }

  public static void bubbleSort(int[] arr) {
    int length = arr.length;
    int temp = 0;
    // { 5, 3, 2, 6} ( i = 0, j = 1 - 3)
    // { 3, 2, 5, 6} ( i = 1, j = 1 - 2)
    // { 2, 3, 5, 6} ( i = 2, j = 1)

    for (int i = 0; i < length; i++) {
      for (int j = 1; j < (length - i); j++) {
        if (arr[j - 1] > arr[j]) {
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static void insertionSort(int array[]) {
    int temp, j;
    for (int i = 1; i < array.length; i++) {
      temp = array[i];
      j = i - 1;
      while (j > -1 && array[j] > temp) {
        array[j + 1] = array[j];
        j--;
      }
      array[j + 1] = temp;
    }
  }

  public static void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      int index = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] < arr[index]) {
          index = j;// searching for lowest index
        }
      }
      int smallerNumber = arr[index];
      arr[index] = arr[i];
      arr[i] = smallerNumber;
    }
  }

  public static int getPivot(int[] arr, int low, int height) {
    int pivot = arr[height];
    int temp, j = low - 1;
    for (int i = low; i < height - 1; i++) {
      if (arr[i] <= pivot) {
        j++;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    temp = arr[j + 1];
    arr[j + 1] = arr[height];
    arr[height] = temp;
    return j + 1;
  }

  public static void quickSort(int[] arr, int low, int height) {
    if (low < height) {
      int pivot = getPivot(arr, low, height);
      quickSort(arr, low, pivot - 1);
      quickSort(arr, pivot + 1, height);
    }
  }
  
}
