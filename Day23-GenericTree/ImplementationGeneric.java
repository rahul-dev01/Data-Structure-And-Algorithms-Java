import java.util.*;
public class ImplementationGeneric {
    static class Node{
        int val ;
        List<Node> child ;

        Node(int val){
            this.val = val ;
            child = new ArrayList<>();
        }
    }

    static void formTree(Node root){
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

    static void preOrder(Node root){
        if(root.child.isEmpty()){
            System.out.print(root.val + " ");
            return ; 
        }
        System.out.print(root.val + " ");
        for(int i = 0 ; i < root.child.size() ; i++){
            preOrder(root.child.get(i));
        }
    }

    static void postOrder(Node root){
        if(root.child.isEmpty()){
            System.out.print(root.val + " ");
            return ; 
        }
        for(int i = 0 ; i < root.child.size() ; i++){
            postOrder(root.child.get(i));
        }
        System.out.print(root.val + " ");
    }

    static void levelOrderTraversalBFS(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node currentNode = q.peek() ;
            System.out.print(currentNode.val +" ");
            q.remove() ;

            for (int i = 0 ; i < currentNode.child.size() ; i++){
                q.add(currentNode.child.get(i)) ;
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(30);

        formTree(root);
        System.out.print("PreOrder : ");
        preOrder(root);

        System.out.println();
        System.out.print("PostOrder : ");
        postOrder(root);

        System.out.println();
        System.out.print("LevelOrder  BFS : ");
        levelOrderTraversalBFS(root);
        
    }
}
