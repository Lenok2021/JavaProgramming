package interviewQuestions;

public class ReserveStringInterview {
    public static void main(String[] args) {

        String str = "Wooden Spoon"; //
        //index#:     012345678910

        String result = ""; // contain  the reserved version of str
        // noopS nedooW,

        //  how to find last index
        /*
        result += str.charAt(11); // we returned n,
        result+= str.charAt(10);
        result+= str.charAt(9);
        result+= str.charAt(8);
        result+= str.charAt(7);
        result+= str.charAt(6);
        result+= str.charAt(5);
        result+= str.charAt(4);
        result+= str.charAt(3);
        result+= str.charAt(2);
        result+= str.charAt(1);
        result+= str.charAt(0);

         */

/*
 Write a program that can reverse any given string
			Ex:	input:
					Wooden Spoon
				output:
				noopS nedooW

 */


       for (int i = str.length() - 1; i >= 0; i--) { //i: index numbers of str (starting from last index to index 0)
            result += str.charAt(i); //  adding each character to result


        }
        System.out.println(result);

    }
}
