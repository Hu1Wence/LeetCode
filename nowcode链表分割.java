public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead == null) {
            return null;
        } else if (pHead.next == null) {
            return pHead;
        }
        ListNode smallHead = new ListNode(0);
        ListNode small = smallHead;
        ListNode largeHead = new ListNode(0);
        ListNode large = largeHead;
        while (pHead != null) {
            if (pHead.val < x) {
                small.next = pHead;
                small = small.next;
            } else {
                large.next = pHead;
                large = large.next;
            }
            pHead = pHead.next;
        }

        //将大的链表最后一位置为null
        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;
    }
}
