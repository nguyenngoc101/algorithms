package leetcode;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = createList(new int[]{9, 9, 9, 9, 9});
        ListNode l2 = createList(new int[]{9});
        ListNode listNode = addTwoNumbers(l1, l2);
        print(listNode);
        //ListNode r1 = reverse(l1);
        //ListNode r2 = reverse(l2);
    }

    private static void print(ListNode list) {
        ListNode cur = list;
        while (cur != null) {
            System.out.println(cur.value);
            cur = cur.next;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = null;
            return head;
        }
    }

    public static ListNode reverse(ListNode list) {
        ListNode head = list, cur = list.next;
        head.next = null;
        ListNode tmp;
        while (cur != null) {
            tmp = head;
            head = cur;
            cur = cur.next;
            head.next = tmp;
        }
        return head;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode head=null, cur = null;
        Integer sum, nextValue, mod = 0;
        while (cur1 != null && cur2 != null) {
            sum = cur1.value + cur2.value + mod;
            mod = sum / 10;
            nextValue = sum % 10;
            ListNode nextNode = new ListNode(nextValue);
            if (head == null) {
                head = nextNode;
                cur = nextNode;
            } else {
                cur.next = nextNode;
                cur = nextNode;
            }

            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        if (cur1 != null) {
            cur.next = addTwoNumbers(cur1, new ListNode(mod));
        }
        if (cur2 != null) {
            cur.next = addTwoNumbers(cur2, new ListNode(mod));
        }
        if (cur1 == null && cur2 == null && mod != 0) {
            cur.next = new ListNode(mod);
        }
        return head;
    }


    public static ListNode createList(int[] values) {
        ListNode head = null, cur = null;
        for (int i = 0; i < values.length; i++) {
            ListNode listNode = new ListNode(values[i]);
            if (head == null) {
                cur = head = listNode;
            } else {
                cur.next = listNode;
                cur = listNode;
            }
        }
        return head;
    }


    static class ListNode {
        public Integer value;
        public ListNode next;

        public ListNode(Integer value) {
            this.value = value;
        }

        public ListNode(Integer value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

}
