class Solution {
    public int minBitFlips(int start, int goal) {
        int xorres=start^goal;   // this gives difference when bit changes give 1 so we get bumber of bit changes is result
        int count=0;
        for(int i=0;i<31;i++){
            if((xorres & (1 << i))!=0){
              count++;
            }
        }
        return count;
    }
}