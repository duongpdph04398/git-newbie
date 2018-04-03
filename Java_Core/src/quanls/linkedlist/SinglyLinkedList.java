package quanls.linkedlist;

public class SinglyLinkedList {
  Node head;

  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      next = null;
    }
  }

  public void addNode(int newData) {
    Node newNode = new Node(newData);
    newNode.next = head;
    head = newNode;
  }

  public void printList() {
    Node currentNode = head;
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
  
  public void printElementByIndexFromTheEnd(int n) {
    //TODO
  }
  
  public static void main(String[] args) {
    SinglyLinkedList simpleLinkedList = new SinglyLinkedList();
    for (int i = 5; i > 0; i--) {
      simpleLinkedList.addNode(i);
      simpleLinkedList.printList();
      simpleLinkedList.printMiddle();
    }
  }
}
