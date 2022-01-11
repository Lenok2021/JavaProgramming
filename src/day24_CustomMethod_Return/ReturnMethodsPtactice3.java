package day24_CustomMethod_Return;

public class ReturnMethodsPtactice3 {
    public static void main(String[] args) {



            //
            String str = "aabccdee";

            for (int i = 0; i < str.length(); i++) { //  when i know how to find  a frequency of one char
// i can repeat it  inside the Loop  for each character
                int frequency = frequency(str, str.charAt(i));

                if(frequency == 1){  //  if frequency is == 1,  that means it's unique
                    System.out.println(str.charAt(i));
                }

            }


        }


        //                              "aaa"      'a'
        public static int frequency(String str, char ch){   // i create method,  that return me
        //  a char  from the String, when i call this method I need to pass one String and one char
// and how many times this char will be occured in a String will be return as integer
            int count = 0;

            for (char each : str.toCharArray()) {
                if(each == ch){
                    count++;
                }
            }

            return count;
        }

    }



