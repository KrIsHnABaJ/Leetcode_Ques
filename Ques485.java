public class Ques485 {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(null));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int result=0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            result =Math.max(result, count);
        }
        return result;
    }
}
