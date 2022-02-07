package day45_Interface_Polymotfism_Intro;

public class Sphere extends Shape implements Volume{

    public Sphere() {
        super("Shere");
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
