import java.util.*;

public class DuplicatesWithIndexDifference {

    public static void main(String[] args){
        int[] nums = {1, 0, 1, 1};
        if (checkDuplicatesAndIndexDifference(nums, 1 )){
            System.out.println("Duplicates with indexes differences lower than 2 found");
        } else {
            System.out.println("Either found difference not less equal K or no duplicates");
        }
    }

    public static boolean checkDuplicatesAndIndexDifference(int[] nums, int k){
        for (int i=0; i<nums.length; i++){
            for (int j=nums.length - 1; j>i; j--){
                if (nums[i] == nums[j] && j - i <= k){
                    System.out.println(j - i);
                    return true;
                }
            }
        }
        return false;
    }


}
