package day24_CustomMethod_Return;

public class ReturnMethodPractice4 {

    public static void main(String[] args) {
     String str = "ccccccccddddddddaaaaabbbb";  // can i just call my method remove duplicates
                 str  = removeDuplicates(str); //  and we assighned method to another variable
        System.out.println(str);
    }
    // remove duplicated characters


     public static String removeDuplicates(String str){ // "aaaabbcc" ==> abc
        //we wrote a method how to remove duplicates
        String result = " ";
        for(int i = 0; i<str.length(); i++){
            char each = str.charAt(i);

            if(!result.contains(" " +each)){ // convert to string concate char to string
                result += each;
            }
        }

        return result;  //
     }


}
