package day28_ArrayList;
import java.util.ArrayList;
public class ArrayListIntro {

    public static void main(String[] args) {

       ArrayList<Integer> numbers = new ArrayList<Integer>();  // only new keyword when create object
 //        specify  data type  - that  means int is stored
      //  ArrayList<Integer> numbers = new ArrayList<>();
//  you  MUST specify data  type,  in  arraylist object  is optional

        ArrayList<String> names = new ArrayList<>();
        //  when  you  print can don't  use Array.toString method

        System.out.println(numbers.toString());
        System.out.println(names);




    }

}
