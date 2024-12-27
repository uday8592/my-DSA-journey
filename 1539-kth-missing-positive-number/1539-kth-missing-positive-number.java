class Solution {
    public int findKthPositive(int[] arr, int k) {
     int misscount=0;
     int index=0;
     int current=1;
     while(misscount<k){
        if(index<arr.length&&arr[index]==current){
            index++;
        }
        else{
           misscount++;
           if(misscount==k)return current;

        }
        current++;               //this increment will occur until the k valye reaches
     }
      return current;
    }
}