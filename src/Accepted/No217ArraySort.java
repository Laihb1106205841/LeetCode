package Accepted;

import java.util.Arrays;

public class No217ArraySort {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
                if(nums[i]-nums[i+1]==0){return true;}
        }
        return false;

    }
}
