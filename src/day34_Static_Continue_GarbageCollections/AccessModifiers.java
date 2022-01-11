package day34_Static_Continue_GarbageCollections;

public class AccessModifiers {

    public static int publicData = 100;
    static int defaultData = 200;//  access modifier: default
    private static int privateData = 300;

    public static void method1(){
        System.out.println("Public");
    }
     static void method2(){
        System.out.println("Public");
    }
    private void method3(){
        System.out.println("Public");
    }




    public static void main(String[] args) {
        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);


    }

}
