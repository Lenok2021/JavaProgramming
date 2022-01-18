package day34_Static_Continue_GarbageCollections;

public class StaticMembers { //  in java only one class can be public, others has default modifier
//  can class can be static?  yes  but we have precondition
    //  nested class,  outer class, inner class is static.
    int a;

    class class1{

    }

    public static int num = 100;

    public static void method(){

    }

    static{  //  static block

    }

}




class A { // outer class  //  we can't make this class static, this class does not belong to other class now

    static class B { // inner class
        // why inner class can be static, because static belongs to the class

        public static void method1(){

        }

    }

}


class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}






class X{

}

class Y {
}
    class Z{  // in this case  class Z belongs to Y
        static class Q{

        }
}






