class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end= Arrays.stream(nums).max().getAsInt();
        int res=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(div(nums,mid)<=threshold){
                res=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;
    }
    public static int div(int[] nums ,int mid){
        int res=0;
        for(int i=0;i<nums.length;i++){
           res += Math.ceil((double) nums[i] / mid);
        }
        return res;
    }
}
