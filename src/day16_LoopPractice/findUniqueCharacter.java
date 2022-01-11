package day16_LoopPractice;

public class findUniqueCharacter {
    public static void main(String[] args) {
        /*
        Write a program that can return the unique characters from a String
            Ex:
                input:
                    AABCCD
                output:
                    BD
            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique

                 */

        // indexOf('A') ==> 0
        // lastIndexOf ('A') ==> 1
        // indexOf('B') ===>2 unique
        // lastIndexOf ('B') ==>2 unique
        String str = "aaabcyuuuuoi";
        //            0123456

        String result = ""; //"b"

        for(int i = 0; i < str.length(); i++){ //i: index numbers of str (starting from 0)

            char ch = str.charAt(i); //ch: each characters of str

            if(str.indexOf(ch) == str.lastIndexOf(ch)){ //if the first and last index numbers of the character are same, then the character is unique
                result += ch;
            }

        }


        System.out.println("result = " + result);



    }
}
