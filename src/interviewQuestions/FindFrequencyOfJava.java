package interviewQuestions;

public class FindFrequencyOfJava {
    public static void main(String[] args) {
        String  str = "JavaJavaJavaJavaJava";


        int frequency = 0;
//                              8 - 4
        for (int i = 0; i < str.length()-3; i++) {// or i < = str.length ()-4
            String eachSub =    str.substring(i, i+4 );
            //System.out.println(eachSub);

            if(eachSub.equals("Java")){
                frequency++;
            }

        }

        System.out.println(frequency);


    }
}
