
public class Implementation {
    static class Node {
        int val;
        Node Left;
        Node Right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void display(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " -> ");
        if (root.Left != null){
            System.out.print(root.Left.val + ", ") ;
        }
        else{
            System.out.print("Null ") ;
        }
            
        if (root.Right != null){
            System.out.print(root.Right.val);
        }else{
            System.out.print("Null");
        }
        System.out.println();

        display(root.Left);
        display(root.Right);
    } 

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.Left = a;
        root.Right = b;

        Node c = new Node(6);
        Node d = new Node(5);

        a.Left = c;
        a.Right = d;

        Node e = new Node(11);
        Node f = new Node(16);
        b.Right = e;
        b.Left = f ;

        display(root);
    }
}
