package mergesortedlists;

class Node {
    int val;
    Node next;

    Node(int key) {
        this.val = key;
        next = null;
    }
}

public class BruteForce {

    static Node merge(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = new Node(l1.val);
                l1 = l1.next;
            } else {
                tail.next = new Node(l2.val);
                l2 = l2.next;
            }
            tail = tail.next;
        }

        while (l1 != null) {
            tail.next = new Node(l1.val);
            l1 = l1.next;
            tail = tail.next;
        }

        while (l2 != null) {
            tail.next = new Node(l2.val);
            l2 = l2.next;
            tail = tail.next;
        }

        return dummy.next;
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

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);

        Node mergedHead = merge(head1, head2);
        printList(mergedHead);
    }
}
