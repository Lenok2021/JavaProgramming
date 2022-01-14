package day39_Encapsulation_Inherintance_Recap.Shapes;

public class Square extends Shapes {

    //1)  we give  instance variables that can not be inherited
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {  // setter responsible for setting data
        if (side <= 0) {
            System.err.println("Invalid side: " + side);
        }
        this.side = side;
    }

    public Square(double side) {
        super("Square");  //
        setSide(side);// we can add  setter here,  when the user put any data, the condition will be checked
    }
}
