package quanls.linkedlist;

public class DoublyLinkedList {
  Node head;

  class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
      this.data = data;
    }
  }

  public void addNode(int newData) {
    Node newNode = new Node(newData);
    newNode.next = head;
    newNode.prev = null;
    if (head != null) {
      head.prev = newNode;
    }
    head = newNode;
  }

  public void printList() {
    Node currentNode = head;
    System.out.print(null + " -> ");
    while (currentNode != null) {
      System.out.print(currentNode.data + " -> ");
      currentNode = currentNode.next;
    }
    System.out.print(currentNode + "\n");
  }

  public void printMiddle() {
    Node slowPointer = head;
    Node fastPointer = head;
    if (head != null) {
      while (fastPointer != null && fastPointer.next != null) {
        slowPointer = slowPointer.next;
        fastPointer = fastPointer.next.next;
      }
      System.out.println("The middle node is " + slowPointer.data + "\n");
    }
  }

  public static void main(String[] args) {
    DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
    for (int i = 5; i > 0; i--) {
      doublyLinkedList.addNode(i);
      doublyLinkedList.printList();
      doublyLinkedList.printMiddle();
    }
  }
}
