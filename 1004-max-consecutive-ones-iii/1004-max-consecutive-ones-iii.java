class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxOnces=0;
        for(int i=0;i<nums.length;i++){
            int ZeroCount=0;
            for(int j=i;j<nums.length;j++){
            
           if(nums[j]==0)ZeroCount++;
           if(ZeroCount<=k){
             int len=j-i+1;
                maxOnces=Math.max(len,maxOnces);
           }else{
            break;
           }
          }
        }
        return maxOnces;
    }
}