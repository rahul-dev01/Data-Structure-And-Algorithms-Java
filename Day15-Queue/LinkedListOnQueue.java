
public class LinkedListOnQueue {

    static class Node { // User Define Data Type
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static class queueOfLinkedList {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int peek() {
            if (head == null) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.val;
        }

        int remove() {
            if (head == null) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        void display() {
            if (head == null && tail == null) {
                System.out.println("Queue is Empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        queueOfLinkedList myQue = new queueOfLinkedList();
        myQue.add(1);
        myQue.add(2);
        myQue.add(3);
        myQue.add(4);

        myQue.display();
        myQue.remove();
        
        System.out.println(myQue.peek());
        myQue.display();
    }
}
