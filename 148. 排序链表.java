import java.util.Arrays;
import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Test {
    public ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        return mergeSort(head);
    }

    private ListNode mergeSort(ListNode head) {
        if (head.next == null) {
            return head;
        }

        ListNode i = head;
        ListNode j = head;
        ListNode prev = null;

        while (j!= null && j.next != null) {
            prev = i;
            i = i.next;
            j = j.next.next;
        }

        prev.next = null;

        ListNode m = mergeSort(head);
        ListNode n = mergeSort(i);
        return merge(m , n);
    }

    private ListNode merge(ListNode m, ListNode n) {
        ListNode temp = new ListNode(0);
        ListNode cur = temp;

        while (m != null && n != null) {
            if (m.val <= n.val) {
                cur.next = m;
                cur = cur.next;
                m = m.next;
            } else {
                cur.next = n;
                cur = cur.next;
                n = n.next;
            }
        }

        if (m != null) {
            cur.next = m;
        }
        if (n != null) {
            cur.next = n;
        }
        return temp.next;
    }
}