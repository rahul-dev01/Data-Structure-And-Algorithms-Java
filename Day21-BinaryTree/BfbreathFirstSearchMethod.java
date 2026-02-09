import java.util.*;

public class BfbreathFirstSearchMethod {

    static class Node {
        int val;
        Node Left;
        Node Right;

        Node(int val) {
            this.val = val;
        }
    }

    static void breathFirstSearch(Node root) {
        Queue<Node> myQue = new LinkedList<>();
        
        if(root != null) myQue.add(root);
 
        while (myQue.size() > 0) {
            Node temp = myQue.peek() ; 
            if(temp.Left != null) myQue.add(temp.Left) ; 
            if(temp.Right != null) myQue.add(temp.Right) ;
            System.out.print(temp.val + " ");
            myQue.remove() ;
        }
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

        Node e = new Node(6);
        Node f = new Node(7);
        b.Left = e;
        b.Right = f;

        breathFirstSearch(root);
    }
}
