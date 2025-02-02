class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxsize=0;
        for(int i=0;i<s.length();i++){
            int maparr[]=new int[255];
            for(int j=i;j<s.length();j++){
                if(maparr[s.charAt(j)]==1)break;
                int len=j-i+1;
                maxsize=Math.max(len,maxsize);
                maparr[s.charAt(j)]=1;
            }
        }
        return maxsize;
    }
}