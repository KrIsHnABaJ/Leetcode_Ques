import java.util.Arrays;

public class Ques26 {
    public static void main(String[] args) {
        int[] arr ={#anyyyy};
        System.out.println(removeElements(arr ,#anyy integer));
    }
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
