package day27_WrapperClasses;

public class WrapperClassIntro {
    public static void main(String[] args) {

        int num1 = 200;
      //  Long n1 = num1;   we can't  if  we have int value

        Integer n1 = num1; // autoboxing //  implicitly done

        int num2 = n1;  // unboxing // implicitly done

        System.out.println("===============================");

       //  we use  wrap  class  to convert primitive to non-primitive//
       //  because  other  data structure accepts  only non-primitive
        //   other  data structure  does not accept  primitive

        Integer integerValue = 100;
        long longValue = integerValue;

        System.out.println("==================================");
        // VERY  IMPORTANT!!!!!!!!!!!!!!!!!!!!!!!!!!!
      //  int num3 = 200;
       // Long l2 = num3;  we can't  if you  have int  you  convert  to int

        Byte b1 = 25;

        byte a1 = b1;  //  whithin  the range
        short a2 = b1;
        int a3 = b1;  //  unboxing
        long a4 = b1;

        System.out.println("================================");

       //  when

        Integer v = 100;
        Integer q = v;
        //  that's not  an autoboxing or unboxing, no primitive DT
        //  we  just converted  to wrapped class objects


        int r = 100;
        Integer r1 = r;
        System.out.println(r1);

    }
}
