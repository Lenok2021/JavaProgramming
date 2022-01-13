package day38_Inheritance.carTask;

public class CarStore {
     public static void main(String[] args) {
          Tesla tesla = new Tesla("Extra", 2010,123000.0,"Back",123);


          Toyota toyota = new Toyota("Carolla",2020,23000.0,"White",234);

          BMW bmw = new BMW("7",2009,20000.0,"Green",234);


          toyota.start();  // I want  to see different implementation
          tesla.start();  //  I need to creat overriding method
          bmw.start();


     }




}
