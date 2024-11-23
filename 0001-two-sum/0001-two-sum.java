class Solution {
    public int[] twoSum(int[] nums, int target) {
   

        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=0;j<nums.length;j++){
        //         sum=nums[i]+nums[j];
        //         if(i!=j && sum==target){
        //          arr[0]=i;
        //          arr[1]=j;
        //         }
        //     }
     //   }
        // return arr;
   // }
//}

     int[] arr=new int[2];
        int res=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            res=target-nums[i];
            if(map.containsKey(res)){
                arr[0]=i;
                arr[1]=map.get(res);
            }
            else{
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}