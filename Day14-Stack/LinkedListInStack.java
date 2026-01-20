public class LinkedListInStack {

   
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top = null; 
    int size = 0;

    void stackPush(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Peek top element
    int stackPeek() {
        if (isEmptyStack()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    // Pop element from stack
    int stackPop() {
        if (isEmptyStack()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        size--;
        return popped;
    }

    int size() {
        return size;
    }

    boolean isEmptyStack() {
        return top == null;
    }

    void displayStack() {
        if (isEmptyStack()) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListInStack myList = new LinkedListInStack();

        myList.stackPush(5);
        myList.stackPush(7);
        myList.stackPush(2);
        myList.stackPush(4);

        System.out.println("Top element: " + myList.stackPeek());
        System.out.println("Popped: " + myList.stackPop());
        System.out.println("Stack size: " + myList.size());
        System.out.println("Is empty: " + myList.isEmptyStack());

        myList.displayStack();
    }
}
