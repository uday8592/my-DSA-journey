class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int tens=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                five=five+1;
            }
            else if(bills[i]==10){
                if(five>0){
                    tens++;
                    five--;
                }else{
                    return false;
                }
            }
            else{
                if(five >=1 && tens >=1){
                    five--;
                    tens--;
                }
                else if(five >= 3){
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
        
    }
}