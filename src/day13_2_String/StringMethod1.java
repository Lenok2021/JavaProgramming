package day13_2_String;

public class StringMethod1 {

    public static void main(String[] args) {
        String str1 = "      batch  25  ";
        // if  you  want  to remove spaces  - UNUSED  spaces(but  not  remove spaces
        // BETWEEN  characters  you  can you  trip  method.
        //as string  is  not  modified,  trim create  anew  string,  RETURNS  you  NEW STRING

        str1 = str1.trim(); // " batch 25"

        System.out.println(str1);

        System.out.println("____________________");

        String str2 = "Cydeo school";
        int n1 = str2.indexOf("h");
        System.out.println(n1);
        System.out.println("______________________");

        int n2 = str2.indexOf("ool");//  name  more uniqe
        System.out.println(n2);

        System.out.println("___________");

        String str3 = "Java  programming";
        int n3 = str3.indexOf("a ");  //  make  more  uniqe
        System.out.println(n3);

        System.out.println("____________");

        int n4 = str3.indexOf("g");
        System.out.println(n4);

        int n5 = str3.lastIndexOf("g");  //  count  numbers  from right  to left

        System.out.println("n5 = " + n5);

        System.out.println("________________");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        System.out.println("firstA = " + firstA);

        int secondA = s.indexOf("a ");
        System.out.println("secondA = " + secondA);

        int thirdA = s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);

         int fourthA = s.indexOf("ava W");
        System.out.println("fourthA = " + fourthA);

        //int six = s.lastIndexOf("va ") +1;
        int six = s.lastIndexOf("a W");
        System.out.println("six = " + six);

        int seventh = s.lastIndexOf("aw");
        System.out.println("seventh = " + seventh);

        int eighth = s.indexOf("a o");
        System.out.println("eighth = " + eighth);


        System.out.println("___________________");

        int lastA = s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int fifthA = s.lastIndexOf("av");
        System.out.println("fifthA = " + fifthA);





    }
}
