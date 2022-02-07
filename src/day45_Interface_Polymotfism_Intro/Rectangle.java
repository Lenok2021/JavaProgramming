package day45_Interface_Polymotfism_Intro;

public class Rectangle extends Shape{

    public Rectangle() {
        super("Rectangle");
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
