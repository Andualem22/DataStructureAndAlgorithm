package queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(1);

        myQueue.enqueue(2);
//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLength();

        myQueue.printQueue();
    }
}
