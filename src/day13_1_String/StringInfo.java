package day13_1_String;

public class StringInfo {

    public static void main(String[] args) {


        String name = "Wooden Spoon";
        String name1 = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";

        System.out.println(name == name1); // true
        System.out.println(name2 == name3); // true


        System.out.println("___________________");

        String str1 = new String("Wooden spoon");

        String str2 = new String("Wooden spoon");

        boolean a = str1 == str2;

        System.out.println("a = " + a);
        System.out.println("_____________________");

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1.equalsIgnoreCase(s2));


        String str3 = "Java";

        String str4 = str3.intern();

        System.out.println(str4);

        System.out.println(str3==str4);

    }
}
