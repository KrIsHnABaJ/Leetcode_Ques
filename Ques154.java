class Solution {
    public static void main(String[] args){
      int[] arr ={#any array};
      System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums) {
    int l = 0;
    int r = nums.length - 1;

    while (l < r) {
      final int m = (l + r) / 2;
      if (nums[m] < nums[r]){
          r = m;
      }       
      else if(nums[m]>nums[r]){
          l = m + 1;
      }
      else{
          r--;
      }
        
    }

    return nums[l];
    }
}
