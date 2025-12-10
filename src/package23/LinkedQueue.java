package package23;

import java.util.LinkedList;

public class LinkedQueue {
    int SIZE = 5;
    LinkedList<Integer> items = new LinkedList<>();
    int front = -1;
    int rear = -1;

    public LinkedQueue(int SIZE) {
        this.SIZE = SIZE;
    }

    public boolean isFull() {
        return front == 0 && rear == SIZE - 1;
    }

    boolean isEmpty() {
        return front == -1;
    }

    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items.set(rear, element);
            System.out.println("Insert " + element);
        }
    }

    public int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {
            element = items.get(front);
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

    public void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        }
        else {
            System.out.println("\nFront index-> " +
                    front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items.get(i) + " ");
            System.out.println("\nRear index-> " + rear);
        }
    }

}
