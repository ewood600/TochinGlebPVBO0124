package package23;

import java.util.LinkedList;

public abstract class AbstractQueue {
    int SIZE = 5;
    int front = -1;
    int rear = -1;

    public AbstractQueue(int SIZE) {
        this.SIZE = SIZE;
    }

    public boolean isFull() {
        return front == 0 && rear == SIZE - 1;
    }

    boolean isEmpty() {
        return front == -1;
    }
}
