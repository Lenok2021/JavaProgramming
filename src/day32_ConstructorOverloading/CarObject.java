package day32_ConstructorOverloading;

public class CarObject {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");

        Car car2 = new Car("Honda","Accord");

        Car car3 = new Car("Lexus","RX350",50000,2021);

        Car car4 = new Car("BMW","X5",60000,2020);

        Car car5 = new Car("Tesla","Model3",70000,2020,"Black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

    }
}
