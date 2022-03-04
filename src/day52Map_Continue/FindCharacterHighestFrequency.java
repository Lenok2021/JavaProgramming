package day52Map_Continue;

import java.util.*;

public class FindCharacterHighestFrequency {

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


    /*
    Write a program that can find the character that has the highest
frequency in a String
Note: Must use a map
Ex:
str = "eeeeeaaabbbbccccdd"
Output:
{e=5, a=3, b=4, c=4, d=2 }
character e has the highest frequency
     */


}
