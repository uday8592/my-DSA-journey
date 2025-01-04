class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer>mm=new HashMap<>();
        mm.put('I',1);
        mm.put('V',5);
        mm.put('X',10);
        mm.put('L',50);
        mm.put('C',100);
        mm.put('D',500);
        mm.put('M',1000);
        int num=0;
        for(int i=0;i<s.length()-1;i++){
            if(mm.get(s.charAt(i))<mm.get(s.charAt(i+1))){
             num-=mm.get(s.charAt(i));
            }
        else{
            num+=mm.get(s.charAt(i));
        }
        }
      return num+mm.get(s.charAt(s.length()-1));
    }
}