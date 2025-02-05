// class Solution {
//     public int subarraysWithKDistinct(int[] nums, int k) {
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             Set<Integer> set=new HashSet<>(k+1);
//             for(int j=i;j<nums.length;j++){
//                 set.add(nums[j]);
//                 if(set.size()==k){
//                     count++;
//                 }
//                 else if(set.size()>k){
//                     break;
//                 }
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int subWithMaxK = subarrayWithAtMostK(nums, k);
        int reducedSubWithMaxK = subarrayWithAtMostK(nums, k - 1);
        return subWithMaxK - reducedSubWithMaxK;
    }
    
    public int subarrayWithAtMostK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0, ans = 0;
        
        while (right < nums.length) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            
            while (map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                left++;
            }
            
            ans += right - left + 1; // Size of subarray
            right++;
        }
        
        return ans;
    }
}