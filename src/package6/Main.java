package package6;

public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(2, 3, 0, 1, 1, 1);
        rectangle.moveDown();
        System.out.println(rectangle.toString());
    }
}
