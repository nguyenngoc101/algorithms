package crackingcodinginterview.linkedlist;

import static java.util.Arrays.asList;

import java.util.List;

public class LinkList {


    public static void main(String[] args) {
        Node linkList = createLinkList(asList(1, 2, 4, 3));
        //print(linkList);
//        print(reverse(linkList));
//        print(reverse(linkList));
//        print(reverse1(linkList));
//        print(reverse1(linkList));
       // print(removeDup(linkList));
        //Node node = removeKthLast(linkList, 1);
        Node node = deleteMiddleNode(linkList);
        print(node);

    }

    public static class  Node {
        public Node next;
        public Integer value;

        public Node(Integer value) {
            this.value = value;
        }
    }

    public static Node reverse(Node head) {
        if (head == null || head.next == null) return head;
        Node cur = head;
        Node next = head.next.next;
        head = head.next;
        head.next = cur;
        cur.next = null;
        while (next != null) {
            cur = next;
            next = next.next;
            cur.next = head;
            head = cur;
        }
        return head;
    }

    public static Node reverse1(Node head) {
        Node cur = head;
        Node pre = null, next = null;
        while (cur != null) {
            // store next
            next = cur.next;
            // reverse pointer
            cur.next = pre;
            // move pointer ahead
            pre = cur;
            cur = next;
        }
        head = pre;
        return head;
    }

    public static Node removeDup(Node head) {
        Node cur = head;
        while (cur != null) {
            Node next = cur.next;
            Node prev = cur;
            while (next != null) {
                if (cur.value == next.value) {
                    // remove dup
                    prev.next = next.next;
                } else {
                    prev = next;
                }
                next = next.next;
            }
            cur = cur.next;
        }
        return head;
    }

    public static Node removeKthLast(Node head, int k) {
        Node cur1 = head;
        Node cur2 = head;
        for (int i = 0; i < k; i++) {
            cur2 = cur2.next;
        }
        while (cur2 != null) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }

    public static Node deleteMiddleNode(Node head) {
        Node cur = head;
        Node next = cur;
        Node prev = null;
        while (next != null && next.next != null) {
            prev = cur;
            cur = cur.next;
            next = next.next.next;
        }
        prev.next = cur.next;
        return head;
    }


    public static Node createLinkList(List<Integer> values) {
        Node head = null;
        Node last = null;
        for (int i = 0; i < values.size(); i++) {
            Node node = new Node(values.get(i));
            if (i == 0) {
                head = node;
                last = node;
            } else {
                last.next = node;
                last = node;
            }
        }
        return head;
    }

    public static void print(Node head) {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.value + " ");
            cur = cur.next;
        }
        System.out.println();
    }

}
