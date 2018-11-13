package com.sagar.coadingbat.recursion;

public class GroupSum5 {
    public boolean groupSum5(int start, int[] nums, int target) {
        if(target==0){
            if(start<nums.length){
                if(nums[start]%5==0){
                    return false;
                }else{
                    return groupSum5(start+1,nums,0);
                }
            }
            return true;
        }
        boolean result = false;
        if(start>=nums.length){
            return false;
        }
        if(nums[start]%5==0 && target-nums[start]<0){
            return false;
        }else if(nums[start]%5==0 && target-nums[start]>=0){
            if((start<nums.length-1 && nums[start+1]==1)){
                result =  groupSum5(start+2,nums,target-nums[start]);
            }else{
                result =  groupSum5(start+1,nums,target-nums[start]);
            }
        }else if(target-nums[start]>=0) {
            result =  groupSum5(start+1,nums,target-nums[start]);
        }else{
            result =  groupSum5(start+1,nums,target);
        }
        if(!result){
            if(nums[start]%5==0){
                return false;
            }
            return  groupSum5(start+1,nums,target);
        }
        return result;
    }

}
