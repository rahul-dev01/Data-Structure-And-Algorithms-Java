public class ArrayInStack {

    class Stack {
        int[] arr = new int[100];
        int top = -1;
    }

    Stack stack = new Stack();

    // Push element onto stack
    void stackPush(int value) {
        if (isStackFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack.arr[++stack.top] = value;
    }

    // Peek top element
    int stackPeek() {
        if (isEmptyStack()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack.arr[stack.top];
    }

    // Pop element from stack
    int stackPop() {
        if (isEmptyStack()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack.arr[stack.top--];
    }

    // Size of stack
    int size() {
        return stack.top + 1;
    }

    // Check if stack is empty
    boolean isEmptyStack() {
        return stack.top == -1;
    }

    // Check if stack is full
    boolean isStackFull() {
        return stack.top == stack.arr.length - 1;
    }

    void displayStack() {
        if (isEmptyStack()) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = stack.top; i >= 0; i--) {
            System.out.println(stack.arr[i]);
        }
    }

    public static void main(String[] args) {
        ArrayInStack myList = new ArrayInStack();

        myList.stackPush(5);
        myList.stackPush(7);
        myList.stackPush(2);
        myList.stackPush(4);

        System.out.println("Top element: " + myList.stackPeek());
        System.out.println("Popped: " + myList.stackPop());
        System.out.println("Stack size: " + myList.size());
        System.out.println("Is empty: " + myList.isEmptyStack());
    }
}
