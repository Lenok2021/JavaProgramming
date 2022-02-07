package day45_Interface_Polymotfism_Intro;

public class Square  extends Shape{

    private double side;

    public Square(double side) {
        super("Square");
      setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side < 0){
            throw new RuntimeException("Invalid side");
        }
        this.side = side;
    }

    @Override
    public double area() {
       double area = side * side;
       return area;
    }

    @Override
    public double perimeter() {
      double perimeter = 2 * (side + side);
      return perimeter;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                super.toString()+
                '}';
    }
}
