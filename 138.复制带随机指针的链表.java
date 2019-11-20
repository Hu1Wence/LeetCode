import java.util.HashMap;

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}
public class Test {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        HashMap<Node, Node> hashMap = new HashMap<>();
        for (Node node = head; node != null; node = node.next) {
            hashMap.put(node, new Node(node.val, null, null));
        }
        for (Node node = head; node != null; node = node.next){
            hashMap.get(node).next = hashMap.get(node.next);
            hashMap.get(node).random = hashMap.get(node.random);
        }

        return hashMap.get(head);
    }
}
