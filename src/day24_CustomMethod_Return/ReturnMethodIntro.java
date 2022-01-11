package day24_CustomMethod_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        String str = "Java";
//  now we called the method again to check is our String "Java" is  a Palindrome???
        String result =  reverse(str); // if return method give you a data then you call it
        // you can assingh it back to a variable

        System.out.println(result);  // printed result.

        if(str.equalsIgnoreCase(result)){ //  if we have a reverse result  can we check
            // "Java" palindrome?//   we compare String Java with reverse  result
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }

    }

  //  we  create method to get a reverse String
    public static String reverse(String str){   //  we get reverse str

        String reverse = "";// we created String to store each character
         // this data type reverse containes data - reversed string
        for(int i=str.length()-1; i>= 0; i--){ // we got each character from String
            reverse += str.charAt(i);// we stored each character to reverse String
        }

        return reverse; // you  return a reverse value
    }


      }



