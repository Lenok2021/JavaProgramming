package day44Abstraction_Continue_Interface.Animal;

public  interface  Properties_Of_Interface {

    int a =100;
    static int b = 200;

    public default void method1(){
        System.out.println("Instance method" + a);
    }

    public static void method2(){
        System.out.println("Static method");
    }

   void method3();

   }





