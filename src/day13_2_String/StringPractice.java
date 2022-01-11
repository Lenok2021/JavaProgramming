package day13_2_String;

public class StringPractice {
    public static void main(String[] args) {

        //1)  trim method
        String name = "    Hello how are you???      ";
        // I am   going to delete spaces  before  and after string "Hello  how are  you?"
        name = name.trim();
        System.out.println("name = " + name);

        String name2 = "     My name is Elena!      ";
        name2 = name2.trim();
        System.out.println("name2 = " + name2);

        System.out.println("_____________________");

        // 2. indexOf  method
        String name3 = "I love go to the school";
        int firstO = name3.indexOf("o");
        System.out.println("firstO = " + firstO);
        System.out.println("________________________________");
        // int secondO = name3.indexOf("o ");
        //System.out.println("secondO = " + secondO);
        // int secondO = name3.indexOf("go") + 1;
        // System.out.println("secondO = " + secondO);
        int secondO = name3.indexOf("o to");
        System.out.println("secondO = " + secondO);

        System.out.println("_____________________________");
        //int thirdO = name3.indexOf("to")+1;
        // System.out.println("thirdO = " + thirdO);
        int thirdO = name3.indexOf("o th");
        System.out.println("thirdO = " + thirdO);
        System.out.println("________________________");

        //int forthO = name3.indexOf("ch")+2;
        // System.out.println("forthO = " + forthO);

        int forthO = name3.indexOf("ol");
        System.out.println("forthO = " + forthO);

        System.out.println("Last   index of");

        //3. lastIndexOf()

        String name4 = "I love my Family, my husband, my child";

        int firstM = name4.lastIndexOf("m");
        System.out.println("firstM = " + firstM);

        System.out.println("________________________________");

        int secondM = name4.lastIndexOf("u") - 4;
        System.out.println("secondM = " + secondM);

        System.out.println("__________________");

        int thirdM = name4.lastIndexOf("ily") - 1;
        System.out.println("thirdM = " + thirdM);

        System.out.println("__________________");

        int forth = name4.lastIndexOf("y F") - 1;
        System.out.println("forth = " + forth);

        System.out.println("Replace");

        String result = "My dress, My pen, My short, My coat";
        result = result.replace("My", "Your");
        System.out.println("result = " + result);

        result = result.replace("Your", "");
        System.out.println("result = " + result);





    }

}
