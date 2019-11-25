import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class Test {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode listNode = lists[0];

        for (int i = 1; i < lists.length; i++) {
            if (listNode == null) {
                listNode = lists[i];
                continue;
            }
            ListNode node = lists[i];
            if (node == null) {
                continue;
            }
            ListNode newHead = new ListNode(0);
            ListNode temp = newHead;
            while (listNode != null && node != null) {
                if (listNode.val <= node.val) {
                    temp.next = listNode;
                    temp = temp.next;
                    listNode = listNode.next;
                } else {
                    temp.next = node;
                    temp = temp.next;
                    node = node.next;
                }
            }
            if (listNode == null) {
                temp.next = node;
            }
            if (node == null){
                temp.next = listNode;
            }
            listNode = newHead.next;
        }
        return listNode;
    }

}
