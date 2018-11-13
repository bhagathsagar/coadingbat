package com.sagar.coadingbat.recursion;

public class GroupNoAdj {

    public boolean groupNoAdj(int start, int[] nums, int target) {
        boolean result = false;
        if(target==0){
            return true;
        }
        if(start >= nums.length){
            return false;
        }
        if(start < nums.length && target - nums[start] >=0){
            result = groupNoAdj(start+2, nums, target-nums[start]);
        }else if(start < nums.length && target - nums[start] < 0){
            result = groupNoAdj(start+1, nums, target);
        }
        if(start>=0 && start<nums.length && !result){
            result =  groupNoAdj(start+1, nums, target);
        }
        return result;
    }


}
