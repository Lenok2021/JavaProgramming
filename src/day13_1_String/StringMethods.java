package day13_1_String;


public class StringMethods {
    public static void main(String[] args) {

        String world  = "Cydeo";
        char thirdChar = world.charAt(2);
        System.out.println("thirChar = " + thirdChar);

       // char thirdChar1 = world.charAt(9); // we can  give  only 5 numbers


        System.out.println("__________________");
        String s1 = "Batch 25 ie the best batch. Hello";
        int totalChar = s1.length();

        System.out.println("totalChar = " + totalChar);
        char lastChar = s1.charAt(totalChar - 1); //  char lastChar = s1.charAt(s1.length() - 1)
        System.out.println("lastChar = " + lastChar);

        System.out.println("--------------");

        String str = "wooden spoon";
        str = str.toUpperCase(); // "WOODEN SPOON

        System.out.println("str = " + str);

        System.out.println("______________________");

String s  = "Java";
s = s.toLowerCase();
        System.out.println("s = " + s);

        System.out.println("____________________");

        String sentence = "Enter your School name String- Can be Multiple words";
        sentence = sentence.toUpperCase();
        System.out.println("sentence = " + sentence);


    }



}
