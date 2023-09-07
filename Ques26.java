import java.util.Arrays;

public class Ques26 {
    public static void main(String[] args) {
        int[] arr ={0,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int count =1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1]){
                count++;
            }
        }
        return count;
    }
}
