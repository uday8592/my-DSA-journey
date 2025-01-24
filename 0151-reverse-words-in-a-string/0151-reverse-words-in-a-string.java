class Solution {
    public String reverseWords(String s) {
        String[] s1=s.trim().split("\\s+");
        String str="";
        for(int i=s1.length-1;i>=0;i--){

            if(i==0){
                str=str+s1[i];
            }else{
                str=str+s1[i]+" ";
            } 

        }
        return str;
    }
}