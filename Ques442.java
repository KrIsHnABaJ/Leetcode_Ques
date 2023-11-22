import java.util.ArrayList;
import java.util.List;

public class Ques442 {
    public static void main(String[] args) {
        int[] arr ={4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(arr));
    }
     public static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(  nums[i]<=nums.length &&nums[i]!=nums[correct] ){
                int temp =nums[i];
                nums[i] =nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
            
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                list.add(nums[j]);
            }
        }
        return list;
    }
}
