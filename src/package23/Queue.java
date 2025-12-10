package package23;

public interface Queue {
    public int SIZE = 5;
    public int[] items = new int[SIZE];
    public int front = -1;
    public int rear = -1;
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
