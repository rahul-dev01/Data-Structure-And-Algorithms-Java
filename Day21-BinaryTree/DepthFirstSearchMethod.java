import java.util.*;

public class DepthFirstSearchMethod {

    static class Node {
        int val;
        Node Left;
        Node Right;

        Node(int val) {
            this.val = val;
        }
    }

    static List<Integer> depthFirstSearch(Node root, ArrayList<Integer> myArr) {
        if (root == null) return myArr;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            myArr.add(temp.val);
            if (temp.Right != null) stack.push(temp.Right);
            if (temp.Left != null) stack.push(temp.Left);
        }
        return myArr;
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

        ArrayList<Integer> myArr = new ArrayList<>();
        depthFirstSearch(root, myArr);

        System.out.println("List: " + myArr);
    }
}
