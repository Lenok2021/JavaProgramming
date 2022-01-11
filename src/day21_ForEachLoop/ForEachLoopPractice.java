package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

         // to find the first and the last character in array  from elements
        String[] words = {"Java Programming", "Cydeo School", "Wooden Spoon", "Early Birds", "Angry Birds"};

        for (String each : words) {
            System.out.println(each.charAt(0) + "" + each.charAt(each.length() - 1));

        }
    }
}