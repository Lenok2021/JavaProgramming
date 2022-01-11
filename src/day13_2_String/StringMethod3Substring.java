package day13_2_String;

public class StringMethod3Substring {
    public static void main(String[] args) {
        
        String word = "Cydeo School"; // every character has INDEX  
        // number  that starts  from 012345
        
        String brand  = word.substring(0, 4+1);
        System.out.println("brand = " + brand);
        System.out.println("________________________________-");
        
        String str1 = word.substring(6);
        //we  starting  from  school we  don't  need  specyfy  the  end  of string

        String word2 = "Java Programming Language";
        String s1 = word2.substring(0, word2.indexOf(" ")); //" Java"
        String s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" ")); // "Programming"
        String s3 = word2.substring (word2.lastIndexOf(" ")+1) ; // Language "
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        
        String my = "longword";
       String my1 = my.substring(0,3);
       String m2 = my.substring(3);

        System.out.println(my1);
        System.out.println(m2);
        
    }
    
}
