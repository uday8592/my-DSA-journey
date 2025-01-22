class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i-1]==nums[i]){
            count++;
            if(count>nums.length/2){
               return  nums[i];
            }
           }
           else{
            count=1;
           }
        }
        return 1;
    }
}