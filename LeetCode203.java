class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            // 如果链表为空
            return null;
        }
        ListNode prev = head;
        ListNode cur = head.next;
        //非头节点情况
        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next;
                cur = prev.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        //头节点情况
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }
}




