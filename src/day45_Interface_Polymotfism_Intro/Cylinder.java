package day45_Interface_Polymotfism_Intro;

public class Cylinder  extends Shape implements Volume{


     private double radius;
     private double height;
     public static double Pi = 3.14;

    public Cylinder(String name, double radius, double height) {
        super(name);
        setHeight(height);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            throw new RuntimeException("Invalid radius");
        }
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0){
            throw new RuntimeException("Invalid height");
        }
        this.height = height;
    }

    @Override
    public double area() {
      return 0;
    }

    @Override
    public double perimeter() {
        return 0;
    }

    @Override
    public void volume() {

    }
}