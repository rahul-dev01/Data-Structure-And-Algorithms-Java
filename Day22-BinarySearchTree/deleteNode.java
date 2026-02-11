public class deleteNode {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null) return new Node(val);

        if (val < root.val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }


    static void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }


    static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }


    static Node delete(Node root, int key) {

        if (root == null) return null;

        if (key < root.val) {
            root.left = delete(root.left, key);
        }
        else if (key > root.val) {
            root.right = delete(root.right, key);
        }
        else {


            if (root.left == null && root.right == null) {
                return null;
            }


            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }


            Node successor = findMin(root.right);
            root.val = successor.val;
            root.right = delete(root.right, successor.val);
        }

        return root;
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

        System.out.print("Before deletion: ");
        inorder(root);

        root = delete(root, 50);

        System.out.print("\nAfter deletion: ");
        inorder(root);
    }
}
