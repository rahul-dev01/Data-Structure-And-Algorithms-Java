
//      1
//     / \
//    2   3
//   / \   \
//  4   5   6
//   \      /
//    7    8
//        /
//        9

import java.util.LinkedList;
import java.util.Queue;

public class ConstructTreeFromLevel {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    static int findHeight(Node root) {
        if(root == null) return 0 ;
        if(root.left == null && root.right == null)  ; 
        return 1 + Math.max(findHeight(root.left),findHeight(root.right));
    }

    static void nthLevel(Node root , int n){
        if (root == null)
            return;
        if(n==1){
            System.out.print(root.val + " ");
            return ; 
        }
        nthLevel(root.left, n - 1);
        nthLevel(root.right , n - 1 );
    }

    public static Node constructTreeBFS(String[] arr) {
        int x = Integer.parseInt( arr[0]) ; 
        Node root = new Node(x) ;
        Queue<Node> q = new LinkedList<>(); 
        q.add(root);
        int n = arr.length;
        int i = 1 ;
        while (i < n - 1) {
            Node temp = q.remove(); 
            Node left = new Node(0);
            Node right = new Node(0);
            if(arr[i].equals("")){
                left = null;
            }
            else{
                int l = Integer.parseInt(arr[i]);
                left.val = l ; 
                q.add(left);   
            }

            if(arr[i+1].equals("")){
                right = null;
            }
            else{
                int r = Integer.parseInt(arr[i+1]);
                right.val = r ; 
                q.add(right);
            }
            temp.left = left ; 
            temp.right = right ; 
            i+=2 ;
        }
        return root ;
    }

    public static void main(String[] args) {
        String[] arr = { "1", "2", "3", "4", "5", "", "6", "", "7", "", "", "8", "", "", "", "9", "" };
        Node root = constructTreeBFS(arr);

        int level = findHeight(root);
        for(int i = 1 ; i <= level ; i++){
            nthLevel(root, i);
            System.out.println();
        }
    }
}
