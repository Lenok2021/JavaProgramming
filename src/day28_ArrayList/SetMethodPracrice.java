package day28_ArrayList;

import java.util.ArrayList;

public class SetMethodPracrice {
    public static void main(String[] args) {

        //  1,2,3,4,5,6,
        //  i  want to *  by 2  all method

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);

        for(int i = 0; i <list.size(); i++){
            list.set(i,list.get(i)*2);  //  i  element,  get  elemets
//  get(i)  pass index  got  element
        }
        System.out.println(list);

    }
}
