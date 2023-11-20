class Ques137 {
    public static void main(String[], args){
        System.out.println(singleNumber(#array))
    }  
    public static int singleNumber(int[] nums) {
        int ans = 0;

    for (int i = 0; i < 32; ++i) {
      int sum = 0;
      for (final int num : nums)
        sum += num >> i & 1;
      sum %= 3;
      ans |= sum << i;
    }

    return ans;
    }
}
