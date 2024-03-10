class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        if(threshold<nums.length){
            return -1;
        }
        int max =Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max =Math.max(max, nums[i]);
        }
        int s =1;
        int e =max;
        while(s<=e){
            int m = s+(e-s)/2;
            if(possible(nums, m, threshold)){
                e =m-1;
            }else{
                s=m+1;
            }
        }
        return s;
    }
    public boolean possible(int[] nums,int val,int threshold){
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            count+=Math.ceil((double)nums[i]/(double)val);
        }
        return count<=threshold;
    }
}
