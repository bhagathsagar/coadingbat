package com.sagar.coadingbat.recursion;

public class GroupSum {

    public boolean groupSum(int start, int[] nums, int target) {
        if(target==0){
            return true;
        }
        boolean result = false;
        if(start>=nums.length){
            return false;
        }
        if(target-nums[start]>=0){
            result = groupSum(start+1,nums,target-nums[start]);
        }else{
            result = groupSum(start+1,nums,target);
        }
        if(!result){
            return groupSum(start+1,nums,target);
        }
        return result;
    }
}
