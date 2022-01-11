package day25_CustomMethod_OverLoding;

public class MergeToArrays {
    public static void main(String[] args) {


    }



   // create a method that can merge two integer arrays.          merger(int[] arr1, int[] arr2)
    public static int[] mergeTwoArray (int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (int eachArr1 : arr1) {
            arr3[i++] = eachArr1;
        }
        for (int eachArr2 : arr2) {
            arr3[i++] = eachArr2;
        }
        return arr3;
    }
    // create a method that can merge two double arrays  merge(double[] arr1, double[] arr2)
    public static double[] mergeTwoArray (double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length + arr2.length];
        int i = 0;
        for (double eachArr1 : arr1) {
            arr3[i++] = eachArr1;
        }
        for (double eachArr2 : arr2) {
            arr3[i++] = eachArr2;
        }
        return arr3;
    }



    // create a method that can merge two char arrays merge(char[] arr1, char[] arr2)
    public static char[] mergeTwoArray (char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length + arr2.length];
        int i = 0;
        for (char eachArr1 : arr1) {
            arr3[i++] = eachArr1;
        }
        for (char eachArr2 : arr2) {
            arr3[i++] = eachArr2;
        }
        return arr3;
    }
    // create a method that can merge two String arrays.          merge(String[] arr1, String[] arr2)
    public static String[] mergeTwoArray (String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length];
        int i = 0;
        for (String eachArr1 : arr1) {
            arr3[i++] = eachArr1;
        }
        for (String eachArr2 : arr2) {
            arr3[i++] = eachArr2;
        }
        return arr3;
    }
     

}
