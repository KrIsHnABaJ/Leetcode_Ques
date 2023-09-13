public class Ques69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(23));
    }
    public static int mySqrt(int x) {
        int a = (int) Math.pow(x, 0.5);
        int b =Math.round(a);
        return b;
    }
}
