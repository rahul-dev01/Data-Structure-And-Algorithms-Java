public class nthLeve {
    
    static class Node {
        int val;
        Node Left;
        Node Right;

        Node(int val) {
            this.val = val;
        }
    }

    static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + " ");
        preOrder(root.Left);
        preOrder(root.Right);
    }

    static int size = 0;

    static void findSize(Node root) {
        if (root == null) return;
        size++;
        findSize(root.Left);
        findSize(root.Right);
    }

    static int findSizeOptimise(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + findSizeOptimise(root.Left) + findSizeOptimise(root.Right);
    }

    static int findSum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.val + findSum(root.Left) + findSum(root.Right);
    }

    static int findMaxValue(Node root) {
         if (root == null) {
            return -1;
        }
        int a = root.val ;
        int b = findMaxValue(root.Left) ;
        int c = findMaxValue(root.Right) ; 
        return Math.max(a , Math.max(b, c)) ;
    }

    static int findHeight(Node root) {
        if(root == null) return 0 ;
        if(root.Left == null && root.Right == null) return 0 ; 
        return 1 + Math.max(findHeight(root.Left),findHeight(root.Right));
    }

    static void nthLevel(Node root , int n){
        if (root == null)
            return;
        if(n==1){
            System.out.print(root.val + " ");
            return ; 
        }
        nthLevel(root.Left, n - 1);
        nthLevel(root.Right , n - 1 );
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.Left = a;
        root.Right = b;

        Node c = new Node(4);
        Node d = new Node(15);

        a.Left = c;
        a.Right = d;

        Node e = new Node(6);
        Node f = new Node(7);
        b.Left = e;
        b.Right = f;

        // Node g = new Node(8);
        // f.Left = g ;

        // preOrder(root);
        // System.out.println();

        // findSize(root);
        // System.out.println("Size is : " + size);

        // System.out.println("Size of Binary Tree is : " + findSizeOptimise(root));

        // System.out.println("Sum : " + findSum(root));

        // System.out.println("The max value : " + findMaxValue(root));

        // System.out.println("Height of tree is : " + findHeight(root));


        nthLevel(root, 2);
    }
}

