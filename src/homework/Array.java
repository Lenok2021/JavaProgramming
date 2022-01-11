package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        ArrayList<String> r = new ArrayList<>();
        r.addAll(Arrays.asList("hello, how are you"));
        String find = "hello";
        String result = "";
        for (int i = 0; i < r.size(); i++) {
            String each = r.get(i);
            if (each.contains(find)) {
                result = find + each.substring(each.indexOf(" "));
            } else {
                result = "search failed";

            }
           

        }
        System.out.println("result = " + result);
    }
}