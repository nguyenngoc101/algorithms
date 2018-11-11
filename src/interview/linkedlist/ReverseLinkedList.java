package interview.linkedlist;

import java.util.Scanner;


public class ReverseLinkedList {

  public static class Node {
    public int data;
    public Node next;

    public Node(int data) {
      this.data = data;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    Node head = null;
    Node currentNode = null;
    for (int i = 0; i < n; i++) {
      Node newNode = createNode(scanner.nextInt());
      if (head == null) {
        head = newNode;
        currentNode = newNode;
      } else {
        currentNode.next = newNode;
        currentNode = newNode;
      }
    }

    currentNode = head;
    while (currentNode != null) {
      System.out.println("current node: "+currentNode.data);
      currentNode = currentNode.next;
    }

    head = reverse(head);

    System.out.println("After reversing.....");
    currentNode = head;
    while (currentNode != null) {
      System.out.println("current node: "+currentNode.data);
      currentNode = currentNode.next;
    }
  }

  private static Node createNode(int data) {
    return new Node(data);
  }

  private static Node reverse(Node node) {
    Node prev = null;
    Node current = node;
    Node next = null;
    while (current != null) {
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    node = prev;
    return node;
  }
}
