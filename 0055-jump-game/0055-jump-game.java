class Solution {
    public boolean canJump(int[] nums) {
        int index=0;
        if(nums.length<=1)return true;
        while(index<nums.length){
            if(nums[index]==0)return false;
            if(index+1==nums.length)return true;
            index+=nums[index];
        }
        return false;
    }
}