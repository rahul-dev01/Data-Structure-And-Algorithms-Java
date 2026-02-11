import java.util.*;

public class Travesel {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static int height(Node root) {
        if (root == null) return -1;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    static Node construct(String[] arr) {
        if (arr.length == 0) return null;

        Node root = new Node(Integer.parseInt(arr[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;

        while (!q.isEmpty() && i < arr.length) {
            Node temp = q.remove();
            if (!arr[i].equals("")) {
                Node left = new Node(Integer.parseInt(arr[i]));
                temp.left = left;
                q.add(left);
            }
            i++;

            // right child
            if (i < arr.length && !arr[i].equals("")) {
                Node right = new Node(Integer.parseInt(arr[i]));
                temp.right = right;
                q.add(right);
            }
            i++;
        }

        return root;
    }

    // 🔹 Print level by level
    static void nthLevel(Node root, int level) {
        if (root == null) return;

        if (level == 1) {
            System.out.print(root.val + " ");
        } else {
            nthLevel(root.left, level - 1);
            nthLevel(root.right, level - 1);
        }
    }


    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }


    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }


    static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {

        String[] arr = {"1","2","3","4","5","","6","","","","","7","8"};

        Node root = construct(arr);

        System.out.println("Height: " + height(root));

        System.out.println("Level Order:");
        int h = height(root) + 1;
        for (int i = 1; i <= h; i++) {
            nthLevel(root, i);
            System.out.println();
        }

        System.out.print("Preorder: ");
        preorder(root);
        System.out.println();

        System.out.print("Inorder: ");
        inorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        postorder(root);
        System.out.println();
    }
}
