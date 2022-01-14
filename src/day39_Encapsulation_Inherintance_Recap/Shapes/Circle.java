package day39_Encapsulation_Inherintance_Recap.Shapes;

public class Circle extends Shapes {

    private double radius;

    public static double Pi = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.err.println("Invalid radius: " + radius);
            System.exit(1);
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
       return radius*radius*Pi;
    }

    @Override
    public double perimeter() {
      return 2*radius*Pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                " Area ='" + area() + '\'' +
                " Perimeter ='" + perimeter() + '\'' +
                '}';
    }
}
