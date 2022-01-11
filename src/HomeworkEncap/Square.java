package HomeworkEncap;

public class Square {

    private int side;
// created getter
    public int getSide() {
        return side;
    }

// created setter under specific condition
    public void setSide(int side) {
        if (side < 0) {
            System.err.println("Invalid side");
            System.exit(0);

        }
        this.side = side;
    }
// creat constructor
    public Square(int side) {
        setSide(side);

    }
// create methods
    public int calcArea(){
        int area = side*side;
        return area;
    }
    public int calcPerimeter(){
        int perimeter = 4*side;
        return perimeter;
    }
    // create toString method


    public String toString() {
        return "Square{" +
                "side=" + side +
                "Area=" + calcArea() +
                "Perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
1.1 Create a class named Square:
				Private variables:
					side

				Encapsulate all the fields
					Condition:
						side of the square should not be negative
				Add a constructor that allows user to set all the fields when the object is created.
								(If the arguments not valid it should not be set to the instances)
				Methods:
					calcArea(): returns the area of square
					calcPerimeter(): returns the perimeter of square
					toString(): can display the side, area, perimeter of square when object is passed in print statement
 */