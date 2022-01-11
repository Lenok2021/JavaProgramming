package day25_CustomMethod_OverLoding;

import utilities.ArraysUtility;

public class TestArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("--------------------------------");

        double[] arr2 = {1.5, 2.5, 3.5, 4.5};

        ArraysUtility.printEachElement(arr2);

        System.out.println("--------------------------------");

        char[] arr3 = {'A', 'B', 'C', 'D'};

        ArraysUtility.printEachElement(arr3);

        System.out.println("--------------------------------");

        String[] names = {"David", "Elvira", "Ali", "Igor"};

        ArraysUtility.printEachElement(names);

        System.out.println("================================");
        int[] n1 = {4, 77, 8, 9,};
        int max1 = ArraysUtility.max(n1);
        System.out.println(max1);

        System.out.println("=========================================");

        double[] n2 = {3.4, 8.7, 6.5};
        double max2 = ArraysUtility.max(n2);
        System.out.println(max2);



    }


}






