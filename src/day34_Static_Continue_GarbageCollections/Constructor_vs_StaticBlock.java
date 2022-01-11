package day34_Static_Continue_GarbageCollections;

public class Constructor_vs_StaticBlock {


    static{
        System.out.println("Static Block");
    }

    public  Constructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");

      /*
        Static Block
        Main method
       */
//  Constructor  will not be executed till your not you create OBJECT
    }

}
