class Shape {
    public void calculateArea() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super.calculateArea();
        this.radius = radius;
    }

}


class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super.calculateArea();
        this.length = length;
        this.width = width;
    }

}
public class day3_ex7 {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println(circle);
        System.out.println(rectangle);
    }
}
