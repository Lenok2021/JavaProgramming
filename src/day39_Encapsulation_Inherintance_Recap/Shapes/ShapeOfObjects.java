package day39_Encapsulation_Inherintance_Recap.Shapes;

public class ShapeOfObjects {

    public static void main(String[] args) {


        //  when we have private  access modifier
        // we restrict it (ogranichivat)
        //  and in order to get access  we use getter or setter
        // we have a block,  we  have control
        // If we do not have public modifier we cannot control what kind of data can be assigned
        // only  one way to read  or write data(modify)   - only getter or setter
        //  we  have full control:  how to get access, what will be assigned, how to modify
        // each Object  has own copy of implementation, which implementation gets executed it
        // depends on   which implementation did  you give

        Square square = new Square(10);
        System.out.println(square);
        // square.side;   we cannot call  through  the Object, BC  side  has private access modifier

        square.setSide(15);
        System.out.println(square);

        square.perimeter();
        square.area();

        System.out.println("-----------------------------------------------------------");
        Rectangle rectangle = new Rectangle(4, 6);

        //  if  I  want to assign another data  to  length.
        // how can I do it?  I  call set  method.  Allows us to write/modify data
        rectangle.setLength(10);
        //  in order to read  call
        System.out.println(rectangle.getLength());

        //if  I  want  to get  access to name from Parents Class
        // rectangle.name;  ERROR
        //  name  have a private modifier in parent class
        // but we encapsulated it in Parent Class
        // we can get access only  through setter or getter

        System.out.println(rectangle.getName());
        rectangle.area();
        rectangle.perimeter();
        System.out.println("------------------------------------------------------");

        Circle circle = new Circle(5);
        System.out.println("circle = " + circle);
        circle.area();
        circle.perimeter();

        System.out.println(circle.getName()); // in order  to read Circle name called getter

    }
}
