public class Ques747 {
    public static void main(String[] args) {
        int [] arr ={3,6,1,0};
        System.out.println(dominantIndex(arr));
    }
    public static int dominantIndex(int[] nums) {
        int max =0;
        int secondmax =0;
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                secondmax=max;
                max=nums[i];
                k=i;
            }
            else if(nums[i]>secondmax){
                secondmax=nums[i];
            }
        }
        if(2*secondmax<=max){
            return k;
        }
        else{
            return -1;
        }
    }
}
