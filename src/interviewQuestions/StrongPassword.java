package interviewQuestions;

public class StrongPassword {

    public static void main(String[] args) {
        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");

        /*
        1) at  first,  I assume  that  password is false (boollean =false,
        that means the password does not
        have lower case, upper case, digits, special char)
        2) only  time  when  we get true  when  the password has upper&lower case, digits, chars
        3) otherwise,  we will get false
         */

        boolean r2 = false; //  has  upper case
        boolean r3 = false;//   has lower case
        boolean r4 = false;//   has  special
        boolean r5 = false; // has digit

        //  we can you  regular For Loop
        //  if you  want to  use For each loop  we need to convert to Array
        //  For  Each Loop  gives  us access to  characters
        char[] chars = password.toCharArray();  //  converted to Array, gave   toCharArray  Method
        for (char each : chars) { // when we have each character  we can verify  upper, digit, lower, char
            if (Character.isUpperCase(each)) {
                r2 = true;  // if upper  case is occurred the boolean from false will be set to  true
            } else if (Character.isLowerCase(each)) {
                r3 = true; //// if lower  case is occurred the boolean from false will be set to  true
            } else if (Character.isDigit(each)) {
                r5 = true; // if digit is occurred the boolean from false will be set to  true
            } else {
                r4 = true;// // if character is occurred the boolean from false will be set to  true
            }

           if(r2 && r3 && r4 && r4){
               break;                // we can  add  break  if first  four chars is already
           }                         //  containes  upper, lower,digits, char
            //this is optional
        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword);




    }

   /*
     /*
     Write a program that can verify if a password is a strong password.
     Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long,  // length >= 8
                and should not contain space
                2. PassWord should at least contain one upper case letter  charcter.upper
                3. PassWord should at least contain one lower case letter  character lower
                4. Password should at least contain one special characters  !charisdisit.isletter
                5. Password should at least contain a digit  characterisGigir
     */


}
