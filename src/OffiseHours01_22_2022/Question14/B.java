package OffiseHours01_22_2022.Question14;


    public class B extends A {
        //@Override
        public void method(int a) {
            System.out.println("B with parameter");
        }

        public static void main(String[] args) {

            B obj = new B();
            obj.method();


        }
    }
