package day13_2_String;

public class StringMethods4 {

    public static void main(String[] args) {
        String str = "   ";
        boolean r  = str.isEmpty();  //  no spaces

        System.out.println("r = " + r);

        boolean r1 = str.isBlank();
        System.out.println(r1);// there is  spaces  but  no  any characters

        System.out.println("________________________");

        String s1 = "Cydeo";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));//  false
        System.out.println(s1.equalsIgnoreCase(s2)); // ignore  low  or  upper case  activity ==> true


        System.out.println("___________________________");

        String sentence  ="My favorite  programming language is Java";
        boolean hasJava = sentence.contains("Java");
        // if  your wanna ignor case activity
        boolean hasJava2 = sentence.toLowerCase().contains("java");

        boolean hasCSharp = sentence.contains("C#");


        System.out.println("hasCSharp = " + hasCSharp);


        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);

        System.out.println("________________________");
        String a = "Wooden  Spoon";
        boolean x = a.startsWith("Woo");
        boolean y  = a.endsWith("Spoon");
        //  if  your  wanna to ignor the case  activity
        boolean z = a.toLowerCase().startsWith("wooden");

        System.out.println("x = " + x);
        System.out.println(y);
        System.out.println("z = " + z);










    }


}
