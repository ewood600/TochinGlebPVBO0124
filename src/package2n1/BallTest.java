package package2n1;

public class BallTest {
    public static void main(String[] args) {
        Ball ball1 = new Ball();
        ball1.setX(1.2);
        ball1.move(1.3, 1.2);
        System.out.println(ball1.toString());
    }
}
