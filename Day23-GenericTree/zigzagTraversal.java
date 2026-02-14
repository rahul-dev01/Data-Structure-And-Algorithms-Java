import java.util.*;

public class zigzagTraversal {

    static class Node {
        int val;
        List<Node> child;

        Node(int val) {
            this.val = val;
            child = new ArrayList<>();
        }
    }

    static void formTree(Node root) {
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));

        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));

        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));

        root.child.get(2).child.add(new Node(31));
        root.child.get(2).child.add(new Node(55));
        root.child.get(2).child.add(new Node(65));
    }

    static void zigzagTraversalBFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag = false;

        while (!q.isEmpty()) {
            int currentLevelSize = q.size();
            List<Node> currentLevel = new ArrayList<>();

            while (currentLevelSize-- > 0) {
                Node currentNode = q.poll();
                currentLevel.add(currentNode);

                for (int i = 0; i < currentNode.child.size(); i++) {
                    q.add(currentNode.child.get(i));
                }
            }

            if (!flag) {
                printList(currentLevel);
            } else {
                Collections.reverse(currentLevel); 
                printList(currentLevel);
            }
            flag = !flag;   
        }
    }

    static void printList(List<Node> nodeList) {
        for (Node node : nodeList) {
            System.out.print(node.val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(30);
        formTree(root);

        zigzagTraversalBFS(root);
    }
}
