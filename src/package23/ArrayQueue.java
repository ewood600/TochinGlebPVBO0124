package package23;

public class ArrayQueue {
    static int SIZE = 5;
    static int[] items = new int[SIZE];
    static int front = -1;
    static int rear = -1;
    static boolean isFull() {
        return front == 0 && rear == SIZE - 1;
    }
    static boolean isEmpty() {
        return front == -1;
    }
    static void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }
    static int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println( element + " Deleted");
            return (element);
        }
    }
    static void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            System.out.println("\nFront index-> " +
                    front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + " ");
            System.out.println("\nRear index-> " + rear);
        }
    }
    public static void main(String[] args) {
        deQueue();
        for(int i = 1; i < 6; i ++) {
            enQueue(i);
        }
        enQueue(6);
        display();
        deQueue();
        display();
    }

}
