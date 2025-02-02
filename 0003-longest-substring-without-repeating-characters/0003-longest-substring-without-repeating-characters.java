// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int maxsize=0;
//         for(int i=0;i<s.length();i++){
//             int maparr[]=new int[255];
//             for(int j=i;j<s.length();j++){
//                 if(maparr[s.charAt(j)]==1)break;
//                 int len=j-i+1;
//                 maxsize=Math.max(len,maxsize);
//                 maparr[s.charAt(j)]=1;
//             }
//         }
//         return maxsize;
//     }
// }

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }
        
        return maxLength;
    }
}