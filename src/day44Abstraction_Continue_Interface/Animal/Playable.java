package day44Abstraction_Continue_Interface.Animal;

public interface Playable {

    static final boolean isFriendly = true;
    // static final by  default, do not use block, IF  is not a class?
    // why is  variable  static ?  static can accept only static members.
    public static void method1(){
        System.out.println(isFriendly);
    }



    void play();  // abstract by default




}
