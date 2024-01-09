import java.util.ArrayList;
import java.util.List;

public class Ques1018 {
    public static void main(String[] args) {
        int [] arr ={1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1}; //test case
        System.out.println(prefixesDivBy5(arr));
    }
    public static List<Boolean> prefixesDivBy5(int[] nums) {
        int ans =0;
        List<Boolean> list =new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            ans=(ans*2 + nums[i])%5;
            list.add(ans==0);
        }
        return list;
    }
}
