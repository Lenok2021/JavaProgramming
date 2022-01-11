package day25_CustomMethod_OverLoding;

public class ReverseArray {
    public static void main(String[] args) {

    }


    // 1. Create a method that can reverse an integer array
    public static int[] reverseArray(int []array){
        int[] reversed  = new int[array.length];

        for(int i = array.length-1, j = 0; i>=0; i--, j++){
            reversed[j]=array[i];
        }
        return reversed;
    }

  //  2. Create a method that can reverse a double array
  public static double[] reverseArray(double []array){
      double[] reversed  = new double[array.length];

      for(int i = array.length-1, j = 0; i>=0; i--, j++){
          reversed[j]=array[i];
      }
      return reversed;
  }
  //3. Create a method that can reverse a char array
  public static char[] reverseArray(char []array){
      char[] reversed  = new char[array.length];

      for(int i = array.length-1, j = 0; i>=0; i--, j++){
          reversed[j]=array[i];
      }
      return reversed;
  }
        
  //  4. Create a method that can reverse a String array
  public static String[] reverseArray(String []array){
      String[] reversed  = new String[array.length];

      for(int i = array.length-1, j = 0; i>=0; i--, j++){
          reversed[j]=array[i];
      }
      return reversed;
  }





}
