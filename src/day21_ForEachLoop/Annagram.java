package day21_ForEachLoop;

import java.util.Arrays;

public class Annagram {

    public static void main(String[] args) {

//  write a program that can check if str1 are build out same characters

        String str1 = "abdse";
        String str2 = "bdase";

        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean a = Arrays.equals(ch1, ch2);
        System.out.println("a = " + a);

    }
}
