public class Ques724 {
    public static void main(String[] args) {
        int [] arr ={1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
    public static int pivotIndex(int[] nums) {
        int total=0;
        for (int i = 0; i < nums.length; i++) {
            total+=nums[i];
        }
        int leftsum=0;
        for (int i = 0; i < nums.length; i++) {
            leftsum+=nums[i];
            if(leftsum*2 == total+nums[i]){
                return i;
            }
        }
        return -1;
    }
}
