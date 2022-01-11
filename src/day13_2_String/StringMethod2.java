package day13_2_String;

public class StringMethod2 {

    public static void main(String[] args) {
        String str = "Java  is fun, I  love learning Java";
        String str2 = str.replace("Java", "Python");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);


        String email = "crosstown11223@yahoo.com";
        email = email.replace("yahoo", "gmail"); // create  new object
        System.out.println("email = " + email);

        String sentence = "Java java Python Python C# C# Python";
        String sentence2 = sentence.replace("Python", ""); //  create  anew  object
        System.out.println("sentence2 = " + sentence2);
        sentence2 = sentence2.replace("  ", "");
        System.out.println("sentence2 = " + sentence2);

        System.out.println("________________________");

        String s = "Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat"); //  cat!!!!!!!!!!!

        System.out.println("s = " + s);
        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace("C# is fun", "Java");
        System.out.println("s2 = " + s2);

        System.out.println("_____________________");
        String s3 = "Java";
        s3 = s3.replace("a", "e"); // Jeve
        System.out.println("s3 = " + s3);

        System.out.println("Replace method");
        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");
        System.out.println("result = " + result);
        System.out.println("________________");

        String result2 = "C# is fun, C# is cool";  //  replace only first C#
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println(result2);
        System.out.println("____________________________");
        String result3 = "Java"; //  replace only first a
        result3= result3.replaceFirst("a", "o");
        System.out.println("result3 = " + result3);

        System.out.println("_______________________");
        String res = "Java";
        res = res.replaceFirst("va", "vo");
        // if your want to replace only "O"  instead of "A",  put  V!!!!!!!!!!!!!!!
        //  from  right  side  as well
        System.out.println("res = " + res);



    }
}
