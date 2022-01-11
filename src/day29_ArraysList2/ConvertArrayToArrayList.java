package day29_ArraysList2;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {

        //    make  sure  data  type is not primitive
        String[] names = {"John", "Jack", " Shay", "Elena"};
        //  callArray List
        ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));
        System.out.println(namesList);

        // another  way  how  to  convert

        ArrayList<String> namesList1 = new ArrayList<>(Arrays.asList(names));//()  constractor
        System.out.println(namesList1);
        // as  List  method  only  for non primite DT


        System.out.println("===================================");

        //  if  a  data  time  is primitive,  we can't convert directly
        //  if  we have  one element  we can, but we have multiple element
        // we  can  creat custom method

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));

        System.out.println(list2);

        System.out.println("-----------------------------------------------------");

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));

        System.out.println("list3 = " + list3);

    }


    public static ArrayList<Integer> convertArrayToArrayList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;
    }

}




