public class CountNodeBT {
    static class Node {
        int val;
        Node Left;
        Node Right;

        Node(int val) {
            this.val = val;
        }
    }

    static int countNode(Node root){
        if(root == null) return 0; 
        return 1 + countNode(root.Left) + countNode(root.Right);
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

        // countNode(root);

        System.out.println("The Node count is :  " + countNode(root));
    }
}
