import java.util.Arrays;

public class Ques338 {
    public static void main(String[] args) {
        System.out.println(countBits(5));
    }
    public static int[] countBits(int num) {
        int[] f = new int[num + 1];
        for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
        System.out.println(Arrays.toString(f));
        return f;
    }
}
