class Solution {
    public boolean isPalindrome(String s) {
       s= s.toLowerCase();
        int strt=0;
        int end=s.length()-1;
        while(strt<end){
           while (strt < end && !Character.isLetterOrDigit(s.charAt(strt))) {
                strt++;
            }
             while (strt < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if(s.charAt(strt)!=s.charAt(end))return false;
            strt++;
            end--;
        }
        return true;
    }
}