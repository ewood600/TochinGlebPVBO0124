package package6;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft = new MovablePoint(0, 0,0, 0);
    private MovablePoint bottomRight = new MovablePoint(0, 0,0, 0);

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.bottomRight = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.topLeft = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{ " +
                "topLeft = " + topLeft +
                ", bottomRight = " + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.y += topLeft.ySpeed;
        bottomRight.y += bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y -= topLeft.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        topLeft.x -= topLeft.xSpeed;
        bottomRight.x -= bottomRight.xSpeed;
    }

    @Override
    public void moveRight() {
        topLeft.x += topLeft.xSpeed;
        bottomRight.x += bottomRight.xSpeed;
    }
}
