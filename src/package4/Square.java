package package4;

public class Square extends Shape{
    public double side;

    public Square(boolean filled, String color, double side) {
        super(filled, color);
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + side +
                '}';
    }

    @Override public double getPerimeter(){
        return side*4;
    }
    @Override public double getArea(){
        return side*side;
    }

    @Override
    public String getType() {
        return super.getType() + "Square";
    }
}
