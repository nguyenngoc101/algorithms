package hackerrank.Chanlenge30Days;

import java.util.Scanner;

public class Day15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node<Integer> head = null;
        for (int i = 0; i < n; i++) {
            head = insert(head, scanner.nextInt());
        }

        Node<Integer> cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
    }

    static class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    public static  Node insert(Node head, int data) {
        Node<Integer> node = new Node<Integer>(data);
        if (head == null) {
            return node;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        return head;
    }


}
