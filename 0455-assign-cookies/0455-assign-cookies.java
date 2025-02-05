class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int childtrack=0;
        int cooktrack=0;
        Arrays.sort(g);
        Arrays.sort(s);
     while (childtrack < g.length && cooktrack < s.length) {


            if(s[cooktrack]>=g[childtrack]){
                childtrack++;
            }
            cooktrack++;
        }
        return childtrack;
    }
}