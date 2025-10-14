package package4;

public class Circle extends Shape{
    public double radius;

    public Circle(boolean filled, String color, double radius) {
        super(filled, color);
        this.radius = radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }

    @Override public double getPerimeter(){
        return radius*2*Math.PI;
    }

    @Override public double getArea(){
        return Math.pow(radius, 2)*Math.PI;
    }

    @Override
    public String getType() {
        return super.getType() + "circle";
    }
}
