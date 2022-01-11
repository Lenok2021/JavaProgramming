package day26_CuctomMethodPractice;

public class FrequenencyOfElement{

    public static void main(String[] args) {
          int [] numbers = {1,1,1,1,1,5,6};
          int n = frequencyOfArray(numbers,1);
        System.out.println(n);


    }


// returns the frequency of the given element from a given Array
 public static int frequencyOfArray(int []array, int element){
         int count = 0;
         for(int each : array){
             if(each == element){
                 count++;
             }
         }
         return count;
    }

}







