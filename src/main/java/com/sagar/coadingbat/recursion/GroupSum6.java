package com.sagar.coadingbat.recursion;

public class GroupSum6 {
    public boolean groupSum6(int start, int[] nums, int target) {
        if(target==0){
            if(start<nums.length){
                if(nums[start]==6){
                    return false;
                }else{
                    return groupSum6(start+1,nums,target);
                }
            }
            return true;
        }
        if(start>=nums.length){
            return false;
        }
        boolean result = false;
        if(nums[start]==6 && target-nums[start]<0){
            return false;
        }else if(target-nums[start]>=0){
            result = groupSum6(start+1,nums,target-nums[start]);
        }else{
            result = groupSum6(start+1,nums,target);
        }
        if(!result){
            if(nums[start]==6){
                return false;
            }else{
                return groupSum6(start+1,nums,target);
            }
        }
        return result;
    }
}
