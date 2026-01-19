public class BasicLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static void printLinkedList(Node a ){
        Node Head = a;
        while (Head != null) { 
            System.out.print(Head.data + " ");
            Head = Head.next;
        }
    }
    static void printLinkedListRecursively(Node head ){
        if(head == null) return ;
        System.out.print(head.data + " ");
        printLinkedListRecursively(head.next);
    }

//      just change the line of print statement it will reverse the linkedlist   

    static void printLinkedListRecursivelyREVERSE(Node head ){
        if(head == null) return ;
        System.out.print(head.data + " ");
        printLinkedListRecursively(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(5); 
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);

        Node insertElement = new Node(13) ;

        a.next = b;
        b.next = insertElement;
        insertElement.next = c ;
        c.next = d;
        d.next = null;


        printLinkedList(a);
        System.out.println();
        printLinkedListRecursively(a);

        System.out.println();

        printLinkedListRecursivelyREVERSE(a);
    }
}
