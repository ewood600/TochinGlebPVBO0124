package package4;

public class Rectangle extends Shape{
    public double width;
    public double length;

    public Rectangle(boolean filled, String color, double width, double length) {
        super(filled, color);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }

    @Override public double getPerimeter(){
        return width*2 + length*2;
    }
    @Override public double getArea(){
        return width*length;
    }

    @Override
    public String getType() {
        return super.getType() + "Rectangle";
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
