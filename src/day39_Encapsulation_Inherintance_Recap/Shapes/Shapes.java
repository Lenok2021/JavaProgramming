package day39_Encapsulation_Inherintance_Recap.Shapes;

public class Shapes {

    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            System.err.println("Name can not be null");
            System.exit(1);// 1:  something went wrong
        }
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name");
            System.exit(1);// 1:  something went wrong
        }
        this.name = name;
    }

    public Shapes(String name) {  // Constructor
        setName(name);
    }

    public double area(){ //  this  implementation will never been used
        // if I am not going to use this implementation I can put even 10
        return 0;  // later in polymorphism we gonna creat methods with no body
    }
    /*
    public String print(){
        return "Blue";  //  that  does not  matter  what  you  put
    }
    */

    public double perimeter(){
        return 0;
    }

/*
    @Override
    public String toString() {  // this is also overridden method  from Object Class
        return super.toString();
    }

    but  also  thString method can be overloading

    */

    @Override
    public String toString() {
        return "Shapes{" +
                " name='" + name + '\'' +
                " Area ='" + area() + '\'' +
                " Perimeter ='" + perimeter() + '\'' +
                '}';
    }
}



/*
Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}



Square extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter


Rectangle extends Shape:
	variables:
		length
		width

	Encapsulate the fields

	Add a constructor to set the filed

	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter


Circle extends Shape:
		variables:
			radius
			pi (static)

		Encapsulate the field

		Add a constructor to set the filed

		area(): radius * radius * pi
		perimeter(): 2 * radius * pi
		toString(): r, pi, area, perimeter




 */