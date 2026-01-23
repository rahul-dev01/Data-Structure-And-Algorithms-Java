public class ArrayOnQueue {

    static class queueOfArray {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] queue = new int[100];

        void add(int val) {
            if (rear == queue.length - 1) {
                System.out.println("Size of Queue is full");
                return;
            }
            if (front == -1) {
                front = rear = 0;
                queue[rear] = val;
            } else {
                queue[++rear] = val;
            }

            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int val = queue[front];
            front++;
            size--;
            return val;
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return queue[front];
        }

        void displayQueue() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            } else {
                for (int i = front; i <= rear; i++) {
                    System.out.print(queue[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queueOfArray myQue = new queueOfArray();
        myQue.add(1);
        myQue.add(2);
        myQue.add(3);
        
        myQue.remove();

        myQue.displayQueue();
        System.out.println(myQue.peek());
    }
}
