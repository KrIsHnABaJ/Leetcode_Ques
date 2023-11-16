class Ques260 {
    public static void main(String[], args){
        System.out.println(singleNumber(int[] nums));
    }
    public static int[] singleNumber(int[] nums) {
        int xorVal = 0;
        for (int num : nums) {
            xorVal ^= num;
        }
        int mask = 1;
        while ((xorVal & mask) == 0) {
            mask <<= 1;
        }
        int res1 = 0;
        int res2 = 0;
        for (int num : nums) {
            if ((num & mask) == 0) {
                res1 ^= num;
            } else {
                res2 ^= num;
            }
        }
        return new int[]{res1, res2};
    }
}
