package OffiseHours01_22_2022;
import java.util.Arrays;
public class Question6 {
    public static void main(String[] args) {

        int [] arr = {4,1,0,-8,4,8};
        int min = minNum(arr);
    }




    public static int minNum(int [] nums){
        Arrays.sort(nums);
        return nums[0];
    }

}
