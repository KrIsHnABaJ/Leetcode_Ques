import java.util.Arrays;

public class Ques1502 {
    public static void main(String[] args) {
        int[] arr ={3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length==2){
            return true;
        }
        for (int i = 1; i < arr.length-1; i++) {
            if((arr[i-1]-arr[i]) != (arr[i]-arr[i+1])){
                return false;
            }
        }
        return true;
    }
}
