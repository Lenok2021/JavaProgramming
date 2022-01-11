package day27_WrapperClasses;

public class Replace {

    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5};
        arr = replace(arr, 4, 7);

        
    }

     //
    public static int[] replace (int [] array, int index, int newElement){
        if(index<0 || index>array.length-1){
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
        
    }

    public static double[] replace (double [] array, int index, double newElement){
        if(index<0 || index>array.length-1){
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    public static char[] replace (char [] array, int index, char newElement){
        if(index<0 || index>array.length-1){
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    public static String[] replace (String [] array, int index, String newElement){
        if(index<0 || index>array.length-1){
            System.out.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }
}
