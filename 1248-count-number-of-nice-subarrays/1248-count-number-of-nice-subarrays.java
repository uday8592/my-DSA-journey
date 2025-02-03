// class Solution {
//     public int numberOfSubarrays(int[] nums, int k) {
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             int oddnum=0;
//             for(int j=i;j<nums.length;j++){
//                 if(nums[j]%2 !=0){
//                     oddnum++;
//                 }
//                 if(oddnum == k){
//                     count++;
//                 }
//                 if(oddnum > k)break;
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }
    
    private int atMostK(int[] nums, int k) {
        int left = 0, count = 0;
        int result = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] % 2 != 0) {
                k--; // Decrease k when an odd number is encountered
            }
            
            while (k < 0) { // Adjust the window when k < 0
                if (nums[left] % 2 != 0) {
                    k++;
                }
                left++;
            }
            
            result += (right - left + 1); // Count subarrays ending at 'right'
        }
        
        return result;
    }
}
