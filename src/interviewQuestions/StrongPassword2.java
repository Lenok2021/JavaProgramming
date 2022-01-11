package interviewQuestions;

public class StrongPassword2 {

    public static void main(String[] args) {

        String password = "SLhhh1223##";

        int countUpperCase = 0; //assume  no upper case
        int countLowerCase = 0; //  assume  no lower case
        int countDigits = 0; // assume no digits
        int countSpecialChar = 0;

        for (int i = 0; i< password.length(); i++){ //  use for loop
            char each = password.charAt(i); //  we got  each  char
            
            if(Character.isUpperCase(each)){
                countUpperCase++;  //  increase  by one
            }else if(Character.isLowerCase(each)){
                countLowerCase++;
            }else if(Character.isDigit(each)){
                countDigits++;
            }else{
                countSpecialChar++;
            }
                    
                    }
               
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countSpecialChar = " + countSpecialChar);
        System.out.println("countDigits = " + countDigits);
        
        boolean hasUpperCase = countUpperCase>0;
        boolean hasLowerCase = countLowerCase>0;
        boolean hasDigits = countDigits>0;
        boolean hasChar = countSpecialChar>0;
        // in order password is strong we have one more condition
        
        boolean strongPassword = password.length()>=8 && !password.contains(" ") && hasUpperCase && hasLowerCase && hasDigits && hasChar;
        System.out.println("strongPassword = " + strongPassword);
    }
}
