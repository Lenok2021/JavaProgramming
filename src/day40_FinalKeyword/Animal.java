package day40_FinalKeyword;

public class Animal {

    private String name;
    private final String breed;
    private final String color;
    private final char gender;
    private String size;
    private int age;
    // in order to use instance variables we need Object
    // we can put them in Constructor


    public Animal(String name, String breed, String color, char gender, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.gender = gender;
        this.size = size;
        this.age = age;
    }

    //------------------Getter-------------
    // we CAN  create getter  for  final variables

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public String getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    //  ----------Setters------------------------
    //  we can generate setters  only  for NON -  final variables
    // we call setter after we created Object, we have final variable
    // we cannot reassign a value

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //--------------------------methods---------------------

    public void eat(){
        System.out.println(name+ " eating");
    }

    public  final void drink(){  //  that means the implementation will be same for all animals
        System.out.println(name+" is drinking");
    }





}
