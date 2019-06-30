import java.util.HashMap;

class Solution138J {
    public Node copyRandomList(Node head) {
        return copyRecursive(head, new HashMap<>());
    }

    private Node copyRecursive(Node target, HashMap<Node, Node> existNodes) {
        if (target == null) {
            return null;
        }
        Node existNode = existNodes.get(target);
        if (existNode != null) {
            return existNode;
        } else {
            Node result = new Node(target.val, null, null);
            existNodes.put(target, result);
            result.next = copyRecursive(target.next, existNodes);
            result.random = copyRecursive(target.random, existNodes);
            return result;
        }
    }
}

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {
    }

    public Node(int _val, Node _next, Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}