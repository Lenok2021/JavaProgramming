package day29_ArraysList2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {
        //  write  program  that  can remove name of country lenght<10

        String [] country = {"Japan", "Korea","Canada", "United States", "United Kingdom", "Turkey"};
        //1  convert  to ArrayList

        ArrayList<String> list = new ArrayList<>(Arrays.asList(country));
        list.removeIf(p-> p.length()>=10);

        //  converting arrayList  to  array

        country=list.toArray(new String[0]);
        System.out.println(Arrays.toString(country));





    }
}
