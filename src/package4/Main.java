package package4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(true, "red", 3);
        System.out.println(circle.toString());
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.getArea());
    }
}
