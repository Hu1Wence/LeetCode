public class PalindromeList {
    public boolean chkPalindrome(ListNode A) {
        if (A == null) {
            return false;
        } else if (A.next == null) {
            return true;
        }
        int len = size(A);
        ListNode B  = A;
        for (int i = 0; i < len / 2; i++) {
            B = B.next;
        }
        ListNode newHead = new ListNode(-1);
        while (B != null) {
            ListNode node = B.next;
            B.next = newHead.next;
            newHead = B;
            B = node;
        }
        while (newHead != null) {
            if (newHead.val != A.val) {
                return false;
            }
            newHead = newHead.next;
            A = A.next;
        }
        return true;
    }
    public int size(ListNode A) {
        int size = 0;
        for (ListNode node = A;
             node != null; node = node.next) {
            size++;
        }
        return size;
    }
}