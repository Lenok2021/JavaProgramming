package day40_FinalKeyword;

public class Dog extends Animal{


    public Dog(String name, String breed, String color, char gender, String size, int age) {
        super(name, breed, color, gender, size, age);
    }
    @Override
    public void eat(){//  we override private method
        System.out.println(getName()+ " is eating food");
    }

  //  public final void drink(){  we cannot  override FINAL  method

  //  }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob","Pitbull","Black",'M',"Big",5);

        dog1.eat();  // method override
        dog1.drink();  // final  method





    }







}
