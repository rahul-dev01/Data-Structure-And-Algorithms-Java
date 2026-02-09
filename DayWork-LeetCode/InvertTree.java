public class InvertTree {

    static class Node {
        int val;
        Node Left;
        Node Right;

        Node(int val) {
            this.val = val;
        }
    }

    static void invert(Node root) {
        if (root == null) return;
        Node temp = root.Left;
        root.Left = root.Right;
        root.Right = temp;

        invert(root.Left);
        invert(root.Right);
    }

    static void print(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        print(root.Left);
        print(root.Right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.Left = a;
        root.Right = b;

        Node c = new Node(4);
        Node d = new Node(5);
        a.Left = c;
        a.Right = d;

        Node e = new Node(11);
        b.Left = e;

        System.out.print("Before invert: ");
        print(root);

        invert(root);

        System.out.print("\nAfter invert: ");
        print(root);
    }
}
