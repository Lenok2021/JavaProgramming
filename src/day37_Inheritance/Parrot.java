package day37_Inheritance;

public class Parrot extends Animal {

   // public String parrotWingColor;  //  I  can create a specific instance  only for  this Object

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
      //  this.parrotWingColor=parrotWingColor; //  we add specific instance variable to Constructor
    }


    public void sing() {
        System.out.println(name + " is singing");
    }


}
