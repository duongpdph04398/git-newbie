import java.util.LinkedList;
import java.util.Scanner;

public class MidNodeInLinkedList {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> list = new LinkedList<>();
    System.out.print("Enter number of element: ");
    int number = sc.nextInt();
    for (int i = 1; i <= number; i++) {
      list.addLast(i);
    }
    System.out.println(list);
    System.out.println(getMiddle(list));
  }

  public static int getMiddle(LinkedList<Integer> list) {
    int mid = 0;
    int last = 0;
    int lastNodeIndex = list.size() - 1;
    while (last < lastNodeIndex) {
      mid += 1;
      last += 2;
    }
    return list.get(mid);
  }
}
