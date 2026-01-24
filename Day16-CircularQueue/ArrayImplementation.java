public class ArrayImplementation {

    public static class CircularQueueArrayImplementation {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[8];


        void add(int val){
            if(size == arr.length ){
                System.out.println("Queue is full");
                return ;
            }
            else if(size == 0){
                front = rear = 0 ;
                arr[0] = val ;
                size++;
                return ;
            }
            else if(rear < arr.length-1){
                arr[++rear] = val ;
                size++;
            }
            else if(rear == arr.length -1 ){
                rear = 0 ;
                arr[0] = val ;
                size++;
            }
        }

        int remove(){
            if(size == 0 ){
                System.out.println("Queue is Empty");
                return -1;
            }
            else{
                int val = arr[front] ;
                if(front == arr.length -1) front = 0 ;
                else front++ ;
                size--;
                return val ;
            }
        }

        int peek(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1 ;
            }
            else{
                return arr[front] ;
            }
        }

        boolean isEmpty(){
            if(size== 0) return true ;
            else return false;
        }

        void displayQueue(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return ;
            }
            else if (front <= rear){
                for(int i = front ; i <= rear ; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            else{ // rear < front
                for(int i = front ; i < arr.length ; i++){
                    System.out.print(arr[i] + " ");
                }
                for(int i = 0 ; i <= rear ; i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueueArrayImplementation myQue = new CircularQueueArrayImplementation();

        myQue.add(1);
        myQue.add(2);
        myQue.add(3);
        myQue.add(4);
        myQue.add(5);
        myQue.add(6);
        myQue.add(7);
        myQue.add(8);

        myQue.displayQueue();

       System.out.println( myQue.remove());

       myQue.add(9);
       myQue.displayQueue();
    }
}
