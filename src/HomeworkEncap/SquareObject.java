package HomeworkEncap;

public class SquareObject {

    public static void main(String[] args) {

       Square square1 = new Square(4);
       System.out.println(square1);

// another way how to call methods for Area and perimeter
        System.out.println("Square is " + square1.calcArea());
        System.out.println("Perimeter is "+square1.calcPerimeter());




    }
}
