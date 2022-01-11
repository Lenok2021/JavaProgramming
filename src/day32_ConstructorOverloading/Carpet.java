package day32_ConstructorOverloading;

public class Carpet {

public double width, length, unitPrice;
public boolean isPersian;
//                  5.5           7.5                $10
public Carpet(double width, double length, double unitPrice, boolean isPersian){
    this.width=width;
    this.length=length;
    this.unitPrice = unitPrice;
    this.isPersian=isPersian;

}
/*
  toString(): should be able to display all the info of the carpet including the total cost
  of the carpet as calculated by calcCost()
 */


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice= $" + calcCost() +
                '}';
    }

    public double calcCost(){
    double totaPrice = (width*length)*unitPrice;
    if(isPersian){
        totaPrice+=200;
    }
    return totaPrice;

}


}

/*
Carpet Task:
	5.1create a custom class for the Carpet class that should contain the following:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitprice

            if the carpet is persian  carpet, add 200$ to the totalPrice

 */
