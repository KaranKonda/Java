public class day3_ex6 {
    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }
static class Circle extends day3_ex6{
        double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
static class Rectangle extends day3_ex6{
        double length,breadth;
        public Rectangle(double length, double breadth){
            this.length = length;
            this.breadth = breadth;
        }

    public double perimeter() {
        return 2*length*breadth;
    }

    @Override
    public double area() {
        return length*breadth;
    }
}
public static void main(String[] args){
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(10,6);
        System.out.println("Circle area:" + c1.area());
        System.out.println("Circle perimeter:" + c1.perimeter());
        System.out.println("Rectangle area:" + r1.area());
        System.out.println("Rectangle perimeter:" + r1.perimeter());
    }


}
