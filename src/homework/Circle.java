package homework;

public class Circle extends Throwable {

    public double radius;
    public static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

   public double calcArea(){
        double area = radius*radius*PI;
        return area;
   }
   public double calcPerimeter(){
        double perimeter = 2*radius*PI;
        return perimeter;
   }
   public double diameter(){
        double diameter = radius*2;
        return diameter;
   }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                ", Area=" + calcArea() +
                ", Perimeter=" + calcPerimeter() +

                ", Diameter=" + diameter() +
                                '}';
    }
}



/*
Circle Task:
		1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter \
					of the circle when the object of circle is passed in the print statement

 */