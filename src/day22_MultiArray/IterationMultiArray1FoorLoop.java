package day22_MultiArray;

public class IterationMultiArray1FoorLoop {
    public static void main(String[] args) {
        // index of the elements:  0 1 2     0 1 2 3    0 1  2 3  4
        int[][] arr2D = { {1,2,3} , {4,5,6,7}, {8,9,10,11,12}  };
        // index of arrays:       0         1            2


        for(int i=0; i < arr2D.length; i++){// in order to get  each array
            // i  is index number single array;
            // 1) arr2D[i] represents each array
            //  System.out.println(Arrays.toString(arr2D[i]));

            for (int j = 0; j < arr2D[i].length; j++) { //j: index number of elements

                System.out.print( arr2D[i][j]+" " ); ////   we get one element from array

            }

            System.out.println(); //  if you  want to print elements in a single line
            //  add  additional print statement

        }



    }
}
