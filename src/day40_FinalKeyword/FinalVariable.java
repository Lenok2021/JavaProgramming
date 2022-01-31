package day40_FinalKeyword;

public class FinalVariable {
    //  final char gender;  // we got compile time error, we HAVE assign value
    final char gender= 'M';
    // if you do not initialize before use you get ERROR

    final String name;  // to avoid error we create constructor

    public FinalVariable(String name) {  //  we assign value and cannot reassign
        this.name = name;
    }

    //  static variable can be final
    final static int birthday;

    static {
        birthday = 1983;
    }


    public static void main(String[] args) {
        // 1.let's  see local variable;
        final double pi = 3.14;
        // pi=4.14;    final variables can not be reassigned

        final String name;
        name = "Java";
        //  name="Wooden Spoon";  we cannot reassign

        System.out.println(name);


        System.out.println("------------------------------------");
        // in order use String name variable we create Object (instance variable)
        FinalVariable obj = new FinalVariable("Elena"); // we assign value once
        //obj.name="Anna";  we  get ERROR, we cannot reassign final variable

        System.out.println("------------------------------------------");

        //lets' call static variable
        System.out.println(FinalVariable.birthday);
        //  FinalVariable.birthday=2002;  we CANNOT  we declare as final


    }
}
