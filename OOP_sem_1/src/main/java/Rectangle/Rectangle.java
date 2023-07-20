package Rectangle;

public class Rectangle {
    private double width;
    private double height;

    Rectangle(double width, double height) {  // конструктор
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    void showDim() {
        System.out.println("Ширина и высота: " + width + " и " + height);
    }
}

class Rectangle1 extends Rectangle {
    // наследуем конструктор нашего класса
    Rectangle1(double height, double width) { super(width, height); }

    double calculateArea () { return (getWidth() * getHeight()); }

    double calculatePerimetr () { return (2 * (getWidth() + getHeight())); }
}
