package day29_ArraysList2;
import java.util.ArrayList;
import java.util.Arrays;
public class UniqueElement {

    public static void main(String[] args) {

    //  find uniqe  element  don't  use Last index  and  first  index
    //  that  means  we need  to  use nested Loop
        //  uniqe  element when  element appeared one  time
        //  if  frequnency  is  one - unique
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        System.out.println(list);


            for (Integer each : list) { //  find  frequency  for  other elements

                int frequency = 0;
                for (Integer element : list) {  //  find  frequency 1 element
                    if(element == each){
                        frequency++;
                    }
                }

                if(frequency == 1){
                    System.out.println(each);
                    break;
                }

            }









        }
}
