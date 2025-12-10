package package23;


public abstract class ArrayQueueADT {
    private int SIZE = 5;
    private Object[] items = new Object[SIZE];
    private int front = -1;
    private int rear = -1;

    public ArrayQueueADT(int SIZE) {
        this.SIZE = ArrayQueue.SIZE;
    }

    public boolean isFull() {
        return ArrayQueue.front == 0 && ArrayQueue.rear == SIZE - 1;
    }

    boolean isEmpty() {
        return ArrayQueue.front == -1;
    }

    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (ArrayQueue.front == -1) {
                ArrayQueue.front = 0;
            }
            ArrayQueue.rear++;
            ArrayQueue.items[rear] = element;
            System.out.println("Insert " + element);
        }
    }

    public Object deQueue() {
        Object element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {
            element = ArrayQueue.items[front];
            if (ArrayQueue.front >= ArrayQueue.rear) {
                ArrayQueue.front = -1;
                ArrayQueue.rear = -1;
            }
            else {
                ArrayQueue.front++;
            }
            System.out.println( element + " Deleted");
            return (element);
        }
    }

    public void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            System.out.println("\nFront index-> " +
                    ArrayQueue.front);
            System.out.println("Items -> ");
            for (i = ArrayQueue.front; i <= ArrayQueue.rear; i++)
                System.out.print(ArrayQueue.items[i] + " ");
            System.out.println("\nRear index-> " + ArrayQueue.rear);
        }
    }

}
