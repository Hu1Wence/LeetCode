class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            //如果链表为空
            return null;
        }

        //获取链表的总长度
        int len = size(head);

        ListNode node = head;
        for (int i = 0; i < len / 2; i++) {
            node = node.next;
        }
        return node;
    }

    public int size(ListNode head) {
        int size = 0;
        for (ListNode node = head; node != null; node = node.next) {
            size++;
        }
        return size;
    }
}

