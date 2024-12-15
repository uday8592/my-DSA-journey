class Solution {
    public int singleNumber(int[] nums) {
    int result=0;
    for(int num:nums){    // exor with same numgives 0 
                          // exor with dif num give the same num
        result=result^num;
    }
    return result;
    }
}