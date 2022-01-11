package HomeworkEncap;

public class Rectangle {

    // 1. declare two private variables
    private int length;
    private int width;

    // created setter and getter  for length

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0) {
            System.err.println("Invalid length");
            System.exit(0);
        }
        this.length = length;
    }

    // created getter and setter for width
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0) {
            System.err.println("Invalid width");
            System.exit(0);
        }
        this.width = width;
    }

    //  creat Constructor


    public Rectangle(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    // created methods
    public int calcArea(){
        int area = length*width;
        return area;
    }

    public int calcPerimeter(){
        int perimeter = 2*(length+width);
        return perimeter;
    }
    // creat toString method


    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", Area is =" + calcArea() +
                ", Perimeter is =" + calcPerimeter() +
                '}';
    }
}




/*
Rectangle Task:
		2.1 Create a class named Rectangle:
				Private variables:
					width, length
				Encapsulate all the fields
						Conditions:
							width of the rectangle should not be negative
							length of the rectangle should not be negative
				Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)
				Methods:
					calcArea(): returns the area of rectangle
					calcPerimeter(): returns the perimeter of rectangle
					toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement

 */