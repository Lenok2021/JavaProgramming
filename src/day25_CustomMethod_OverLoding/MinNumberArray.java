package day25_CustomMethod_OverLoding;

public class MinNumberArray {

    public static void main(String[] args) {


    }


    //create a method that can return the min number from an integer array
    public static int minNumberFromArray(int[] array) {
        int min = 0;
        for (int eachElement : array) {
            if (eachElement < min) {
                eachElement = min;
            }
        }
        return min;
    }
  // 2. create a method that can return the min number from double array
  public static double minNumberFromArray(double[] array) {
      double min = 0;
      for (double eachElement : array) {
          if (eachElement < min) {
              eachElement = min;
          }
      }
      return min;
  }
   // 3. create a method that can return the min number from long array
   public static long minNumberFromArray(long[] array) {
       long min = 0;
       for (long eachElement : array) {
           if (eachElement < min) {
               eachElement = min;
           }
       }
       return min;
   }
   // 4. create a method that can return the min number from short array
   public static short minNumberFromArray(short[] array) {
       short min = 0;
       for (short eachElement : array) {
           if (eachElement < min) {
               eachElement = min;
           }
       }
       return min;
   }
   // 5. create a method that can return the min number from float array
   public static float minNumberFromArray(float[] array) {
       float min = 0;
       for (float eachElement : array) {
           if (eachElement < min) {
               eachElement = min;
           }
       }
       return min;
   }
   // 6. create a method that can return the min number from byte array
   public static byte minNumberFromArray(byte[] array) {
       byte min = 0;
       for (byte eachElement : array) {
           if (eachElement < min) {
               eachElement = min;
           }
       }
       return min;
   }
     


}
