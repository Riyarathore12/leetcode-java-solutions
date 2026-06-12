class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int close = nums[0]+nums[1]+nums[2];

        for(int i =0; i<n-2; i++){
            int l = i+1 ,  r = n-1;
            while(l < r){
               int sum = nums[i]+ nums[l]+nums[r];

                if(Math.abs(sum - target) < Math.abs(close - target)){
                    close = sum;
                }
                if(sum < target) l++;
                else r--;

            }
        }
        return close;

    }
}