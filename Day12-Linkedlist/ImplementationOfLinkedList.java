
public class ImplementationOfLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Manually created LinkedList dataType
    public static class LinkedList {
        Node head = null;
        Node tail = null;

        // This is going to print all the element of LinkedList
        void displayLinkedList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // This is going to INSERT a elment a END of the linkedlist
        void insetAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        // This is going to ADD an element at the HEAD
        void insertElementAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // This is going to INSERT an element at given index
        void insertAtIndex(int index , int val){
            Node newVal = new Node(val) ;
            Node temp = head ; 
            for(int i = 1 ; i < index - 1 ; i++){
                temp = temp.next ; 
            }
            newVal.next = temp.next ; 
            temp.next = newVal ;
        }

        // This is going to GET the ELEMENT BY INDEX 
        int getElementByIndex(int index) {
            Node temp = head ;
            for(int i = 0 ; i <= index ; i++){
                temp = temp.next ; 
            }
            return temp.data ; 
        }

        // This is going to DELETE the element by index
        void deleteElement(int index) {
            if(index == 0 ){
                head = head.next ;
            }
            Node temp = head ;
            for(int i = 1 ; i < index - 1 ; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next ;
        }
    }

    public static void main(String[] args) {

        LinkedList myList = new LinkedList();
        myList.insetAtEnd(4); // 4
        myList.insetAtEnd(7); // 4 -> 7

        myList.displayLinkedList();

        // New Element at Head
        myList.insertElementAtHead(10); // 10 -> 4 -> 7
        myList.displayLinkedList();

        // Given Index 
        myList.insertAtIndex(1, 17);    // 10 -> 17 -> 4 -> 7
        myList.displayLinkedList();

        //Get Element 
        System.out.println(myList.getElementByIndex(2)); 

        // Delete Element 
        myList.deleteElement(3); 
        myList.displayLinkedList();

    }
}
