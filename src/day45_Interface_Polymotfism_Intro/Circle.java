package day45_Interface_Polymotfism_Intro;

public class Circle extends Shape {

    private double radius;

    public final static double Pi = 3.14;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){
            throw  new RuntimeException("Invalid Radius");
        }
        this.radius = radius;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public double area() {
      double area = radius * radius * Pi;
      return area;
    }

    @Override
    public double perimeter() {
        double area = 2* radius *Pi;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + getName() + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                ", radius=" + radius +
                '}';
    }
}
