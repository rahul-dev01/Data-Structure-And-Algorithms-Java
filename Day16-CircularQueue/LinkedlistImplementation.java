
public class LinkedlistImplementation {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class CircularQueueLinkedListImplementation {
        Node front = null;
        Node rear = null;
        int size = 0;
        int capacity = 8; 

        void add(int val) {
            if (size == capacity) {
                System.out.println("Queue is full");
                return;
            }

            Node newNode = new Node(val);

            if (size == 0) {
                front = rear = newNode;
                rear.next = front; 
            } else {
                rear.next = newNode;
                rear = newNode;
                rear.next = front; 
            }

            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int val = front.data;

            if (size == 1) {
                front = rear = null;
            } else {
                front = front.next;
                rear.next = front; 
            }

            size--;
            return val;
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return front.data;
        }

        boolean isEmpty() {
            return size == 0;
        }

        void displayQueue() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            }

            Node temp = front;
            for (int i = 0; i < size; i++) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueueLinkedListImplementation myQue = new CircularQueueLinkedListImplementation();

        myQue.add(1);
        myQue.add(2);
        myQue.add(3);
        myQue.add(4);
        myQue.add(5);
        myQue.add(6);
        myQue.add(7);
        myQue.add(8);

        myQue.displayQueue();

        System.out.println(myQue.remove());

        myQue.add(9);
        myQue.displayQueue();
    }
}
