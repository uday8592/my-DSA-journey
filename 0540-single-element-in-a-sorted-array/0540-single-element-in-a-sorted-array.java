class Solution {
    public int singleNonDuplicate(int[] nums) {


        int strt=0;
        int end=nums.length-1;
        if(nums.length<2){
            return nums[0];
        }
        while(strt<=end){
            if(nums[strt]!=nums[strt+1]){
               return nums[strt];
            }
             if(nums[end]!=nums[end-1]){
                return nums[end];
            }
           strt=strt+2;
           end=end-2;
        }
        return -1;
        
    }
}