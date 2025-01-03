class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)return false;
      // here 16 means 10000 only one set bit in power of tows 
      // so we check and operation with it 15 1111(n-1)
      // 10000
      // 01111
      //result 00000 so power of 2

        if((n&(n-1))==0)return true;
        return false;
        
    }
}