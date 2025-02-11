class Solution {
    public boolean canJump(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > index) return false; 
            index = Math.max(index, i + nums[i]);
            if (index >= nums.length - 1) return true; 
        }
        return false;
    }
}