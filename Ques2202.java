class Ques2202 {
    public static void main(String[] args) {
        int[] arr ={1,2,1000000000};
        System.out.println(maximumTop(arr, 2));
    }
    public static int maximumTop(int[] nums, int k) {
        int ans= 0;
        if(nums.length<=1){
            if(k%2!=0){
                return -1;
            }else{
                return nums[0];
            }
        }
        int newk = k+1;
        if(k>=nums.length){
            newk=nums.length;
        }
        for (int i = 0; i < newk; i++) {
            int count = nums[i];
            ans=Math.max(count, ans);
        }
        return ans;
    }
}