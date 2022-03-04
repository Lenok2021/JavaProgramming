package interviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacterMap {


    public static void main(String[] args) {



        String  str = "aabcccdeeeef";

        Map<String, Integer> result = new LinkedHashMap<>();

        // find the F  takes nested loop
        // we can use Map to find F.
        // 1. Convert String to Array
        // 2. Convert Array to Collection type, by using Arrays.asList method

        String [] arr = str.split("");
        //  to get access to each element = for each loop

        for (String each : arr) {

            int frequency = Collections.frequency(Arrays.asList(arr), each);
            // Collections.frequency  = method accept coll type that's why we convert arr to collection type

            if(frequency ==1){
                result.put(each,1);  //  if condition == 1 we passed 1
            }
            System.out.println("result = " + result);


        }





    }


}
