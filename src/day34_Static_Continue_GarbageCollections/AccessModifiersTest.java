package day34_Static_Continue_GarbageCollections;

public class AccessModifiersTest {


    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);//only inside one class
        System.out.println(AccessModifiers.defaultData); //only inside the same package
       //System.out.println(AccessModifiers.privateData); //private is not visible outside the class

        AccessModifiers.method1();
        AccessModifiers.method2();
     //   AccessModifiers.method3();  private method



    }


}
