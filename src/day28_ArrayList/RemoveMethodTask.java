package day28_ArrayList;

import java.util.ArrayList;

public class RemoveMethodTask {

    public static void main(String[] args) {

        // remove  one element at time
        //  when Integer  is  non primive DT -  remove element

        ArrayList<Integer> number = new ArrayList<>();
        number.add(100);
        number.add(200);
        number.add(300);
        number.add(400);
        number.add(150);
        number.add(200);

        int num = 0;
        number.remove(0);  //  remove index
        System.out.println(number);
        Integer num2 = 150; // remove is  INDEx  OBJECT
        // Integer  is from Wrapped class
        boolean a = number.remove(num2);  // assign  to boolean, if  remove  true
        System.out.println(number);
        System.out.println(a);




    }

}
