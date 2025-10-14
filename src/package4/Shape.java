package package4;

public abstract class Shape {
    public boolean filled;
    public String color;

    public String getType(){
        return "Тип фигуры: ";
    }
    public double getArea(){
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "filled=" + filled +
                ", color='" + color + '\'' +
                '}';
    }

    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape(boolean filled, String color) {
        this.filled = filled;
        this.color = color;
    }

    public Shape() {
    }

}
