package interviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindElementMaxFreqMAP {

    public static void main(String[] args) {

        String str = "eeeeeaaabbbbccccdd";

        //1.convert String to array.
        String array[] = str.split("");

        //2. create Map.
        Map<String, Integer> map = new LinkedHashMap<>();

        //3. Iterate array.
        for (String eachElement : array) {  // each represents each Element in Array
            int frequency = Collections.frequency(Arrays.asList(array), eachElement);
            map.put(eachElement, frequency);
        }
        //4. Maximum freq.
        int highestFrequency = Integer.MIN_VALUE;
        String character = "";
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue() > highestFrequency){
                highestFrequency = pair.getValue();
                character = pair.getKey();
            }
        }
        System.out.println(map);
        System.out.println("Character " + character+ " has the maximum frequency.");


    }





    }

