package package23;

public interface Queue {
    int SIZE = 5;
    int[] items = new int[SIZE];
    int front = -1;
    int rear = -1;
    static boolean isFull() {
        return false;
    }
    static boolean isEmpty() {
        return false;
    }
    static void enQueue(int element) {
    }
    static int deQueue() {
        return 0;
    }
    static void display() {
    }
}
