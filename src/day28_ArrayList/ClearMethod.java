package day28_ArrayList;

import java.util.ArrayList;

public class ClearMethod {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(100);
        number.add(200);
        number.add(300);
        number.add(400);
        number.add(150);
        number.add(200);

        number.clear();  //  remove all elements  from Array list
        //  return size=0
        System.out.println(number);

    }
}
