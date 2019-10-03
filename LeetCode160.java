public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int lenA = size(headA);
        int lenB = size(headB);
        int temp = 0;
        if (lenA < lenB) {
            temp = lenB - lenA;
            for (int i = 0; i < temp; i++) {
                headB = headB.next;
            }
            while (headA != null || headB != null) {
                if (headA == headB) {
                    return headA;
                }
                headA = headA.next;
                headB = headB.next;
            }
        } else {
            temp = lenA - lenB;
            for (int i = 0; i < temp; i++) {
                headA = headA.next;
            }
            while (headA != null || headB != null) {
                if (headA == headB) {
                    return headA;
                }
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }

    public int size(ListNode Node) {
        int size = 0;
        for (ListNode node = Node; node != null; node = node.next) {
            size++;
        }
        return size;
    }
}
