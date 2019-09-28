class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            //如果为空链表
            return null;
        } else if (head.next == null) {
            //如果链表只有一个元素
            return head;
        }
        ListNode prev = null;
        ListNode newHead = null;
        while (head != null) {
            ListNode node = head.next;
            if (node == null) {
                newHead = head;
            }
            head.next = prev;
            prev = head;
            head = node;
        }
        return newHead;
    }
}


