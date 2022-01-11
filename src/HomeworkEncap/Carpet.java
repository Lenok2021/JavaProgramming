package HomeworkEncap;

public class Carpet {

    //1. creat private variables
    private int width;
    private int length;
    private double unitPrice;
    private boolean isPersian;

    //2. create getters and setters for all private variables
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

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            System.err.println("Invalid unit price");
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public boolean getPersian() {
        return isPersian;
    }

    public void setPersian(boolean isPersian) {
        this.isPersian = isPersian;
    }
    //3. create Constructor


    public Carpet(int width, int length, double unitPrice, boolean isPersian) {
        setWidth(width);
        setLength(length);
        setUnitPrice(unitPrice);
        setPersian(isPersian);

    }

    // 4. create methods
    public double calcPrice() {
        double totalPrice=0;
        if(isPersian){
             totalPrice = ((width * length) * unitPrice)+200;
        }else{
             totalPrice = (width * length) * unitPrice;
        }

        return totalPrice;

    }

    //5. create toString Method



    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", Total price is = " +"$"+ calcPrice() +
                '}';
    }
}



/*
Carpet Task
		3.1create a class named Carpet:
                private variables:
                        width, length, unitPrice, isPersian (boolean)
                Encapsulate all the fields:
                		Conditions:
                			width can not be negative
                			width can not be negative
                			unit price can not be negative
		Add a constructor to set all the instances
                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet = (width*length)*unitPrice
            if the carpet is persian  carpet, add 200$ to the totalPrice
 */