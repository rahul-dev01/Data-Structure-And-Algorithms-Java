
public class ImplementationDoublyLinkedlist {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static class DoublyLinkedList {
        Node head = null;
        Node tail = null;

        // Display Linked List (Forward)
        void displayLinkedList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Insert at End
        void insertAtEnd(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
        }

        // Insert at Head
        void insertElementAtHead(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
        }

        // Insert at Given Index (0-based)
        void insertAtIndex(int index, int val) {

            if (index == 0) {
                insertElementAtHead(val);
                return;
            }

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            Node newNode = new Node(val);
            newNode.next = temp.next;
            newNode.prev = temp;

            if (temp.next != null) {
                temp.next.prev = newNode;
            } else {
                tail = newNode;
            }

            temp.next = newNode;
        }

        // Get Element by Index (0-based)
        int getElementByIndex(int index) {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // Delete Element by Index (0-based)
        void deleteElement(int index) {

            if (index == 0) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
                return;
            }

            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

            if (temp.next != null) {
                temp.next.prev = temp.prev;
            } else {
                tail = temp.prev;
            }

            temp.prev.next = temp.next;
        }
    }

    public static void main(String[] args) {

        DoublyLinkedList myList = new DoublyLinkedList();

        myList.insertAtEnd(4); 
        myList.insertAtEnd(10);
        myList.displayLinkedList();

        myList.insertElementAtHead(2); 
        myList.displayLinkedList();

        myList.insertAtIndex(1, 99); 
        myList.displayLinkedList();

        System.out.println(myList.getElementByIndex(2));

        myList.deleteElement(3); 
        myList.displayLinkedList();
    }
}
