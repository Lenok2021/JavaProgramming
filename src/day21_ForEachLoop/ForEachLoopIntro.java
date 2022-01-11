package day21_ForEachLoop;
import java.util.Arrays;
public class ForEachLoopIntro {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70};
        //                0  1  2  3  4  5  6

        for (int i = 0; i < numbers.length; i++) { // i: indexes of the array
            int eachElement = numbers[i];
            System.out.println(eachElement);
        }

        System.out.println(numbers);

        for(int each  : numbers ){ // each: elements of the array
            System.out.println(each);
        }


            String a = "java";
            a.toLowerCase();

            String b = "Java";
            b.toLowerCase();

            String c = new String ("Java");
            c.toLowerCase();

            if (a==b){
                System.out.println("I love Java");
            }else if(b==c){
                System.out.println("Hello Hello");
            }else if(c.equalsIgnoreCase(a)){
                System.out.println("-_-");
            }

    }




    }



