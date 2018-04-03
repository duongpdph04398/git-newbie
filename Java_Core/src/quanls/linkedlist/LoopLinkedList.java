package quanls.linkedlist;

public class LoopLinkedList {
  Node head;

  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      next = null;
    }
  }
}
