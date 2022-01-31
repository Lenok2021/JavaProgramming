package day43_Abstruction.Car;

public class CarShop {

    public static void main(String[] args) {

          //  Car car1 = new Car(); !!!!
         // if  we want to create OB  from AC  we gor error
        // we cannot do it BC  AC is not concrete
        //we cannot creat OB  from AS

Honda honda = new Honda("Accord", "Black", "Germany",2020,20000);
Audi audi = new Audi("Q7", "Black", "USA",2020,30000);
Tesla tesla = new Tesla("Model13", "White", "London",2020,30000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        //  since Color variable DOES NOT have FINAL modifier we can reassign value
        honda.setColor("Pink");
        audi.setColor("Green");
        tesla.setColor("Blue");

        System.out.println(honda.getBrand());



    }
}
