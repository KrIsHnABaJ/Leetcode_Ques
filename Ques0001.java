import java.util.Arrays;

public class Ques1 {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int [] ans =twoSum(arr, 6);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length;j++) {
                if(target == nums[i]+nums[j] && i!=j ){
                    return new int[] {i,j};
                }
                
                
            }
        }
        return new int[] {0,0};
    }
}
