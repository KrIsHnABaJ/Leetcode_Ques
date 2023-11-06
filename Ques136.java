public class Ques136 {
    public static void main(String[] args) {
        int [] arr={1,2,3,2,5,1,5};
        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int index =0;
        for (int i = 0; i < nums.length; i++) {
            index = index^nums[i];
               
        }
        return index; 
}
}
