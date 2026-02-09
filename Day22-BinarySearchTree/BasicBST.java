public class BasicBST {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    static boolean search(Node root, int key) {
        if (root == null)
            return false;

        if (root.val == key)
            return true;

        if (key < root.val)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    static int findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    static int findMax(Node root) {
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 50);
        insert(root, 30);
        insert(root, 70);
        insert(root, 20);
        insert(root, 40);
        insert(root, 60);
        insert(root, 80);

        System.out.print("Inorder (sorted): ");
        inorder(root);
        System.out.println();

        System.out.println("Search 40: " + search(root, 40));
        System.out.println("Search 90: " + search(root, 90));

        System.out.println("Minimum: " + findMin(root));
        System.out.println("Maximum: " + findMax(root));
    }
}
