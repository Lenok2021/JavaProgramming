package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {


        // parse  method
        String str = "123"; // we can convert  to primitives
        int num = Integer.parseInt(str); // int
        System.out.println(num + 1);
        System.out.println(str + 1);
        System.out.println("===============================");

        String str2 = "10.5";
        double num1 = Double.parseDouble(str2); // returns double  and can assigh to double
        System.out.println(num1);
        System.out.println(num1 + 1);

        System.out.println("============================================");


        //this method converts String to Wrapper Class Object not to primitives
        String s2 = "123";
        Integer x = Integer.valueOf(s2);
        int r = Integer.valueOf(s2); // integer

        System.out.println(r);

        System.out.println("===========================");



        //  get  max  and  minimum  in Java
        int max = Integer.MAX_VALUE;  // helps you to get  max value from all primit. DT
        int min = Integer.MIN_VALUE;//  helps you to get min number from all primit Dt
        System.out.println(max); // you don't need to memorize it, just call method
        System.out.println(min);

        long max1 = Long.MAX_VALUE;
        long min1 = Long.MIN_VALUE;
        System.out.println(max1);
        System.out.println(min1);

        System.out.println("============================================");

        // we have string true, the method helps us to convert string to boolean
        //  while th String equal true it will return  you true
        String s1 = "true"; // string to boolean
        //String s1 = "maybe"; // false
        boolean r1 = Boolean.parseBoolean(s1);
        System.out.println(r1);

        System.out.println("===========================================");

    //  this method Character WrapperClass
        // if you have  any char value,and  you  want to verify
        char ch1 = '!';

        //isDigit()
        boolean r2 = Character.isDigit(ch1);

        //isLetter()
        boolean r3 = Character.isLetter(ch1);

        // special char
        boolean r4= !Character.isLetterOrDigit(ch1);

        // upperCase
        boolean r5 = Character.isUpperCase(ch1);

        //lowerCase
        boolean r6 = Character.isLowerCase(ch1);

        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        System.out.println("----------------------------------");

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if( Character.isDigit(each) ){
                sum +=  Integer.parseInt(""+each);
            }

        }

        System.out.println("sum = " + sum);


        String s3 = "1234567";
        Integer x1 = Integer.valueOf(s2);
        int rrr = Integer.valueOf(s3); // integer
        System.out.println(rrr);

    }
}
