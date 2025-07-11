package mergesortedlists;
class Node {
    int val;
    Node next;

    Node(int key) {
        this.val = key;
        next = null;
    }
}
public class Optimal{
    static Node merge(Node l1, Node l2) {;
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        Node ans = l1;
        while (l1 != null && l2 != null)
        {
            Node temp = l1;
            while(l1!=null && l1.val <= l2.val) {
                temp = l1;
                l1 = l1.next;
            }
            temp.next = l2;
            Node t = l1;
            l1 = l2;
            l2 = t;   
        }
        return ans;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);

        // 1 -> 2 -> 4

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);

        // 1 -> 3 -> 4

        Node mergedhead = merge(head1, head2);
        printList(mergedhead);
    }
}
