public class Ques191 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(#any int));
    }
    public static int hammingWeight(long n) {
        int count =0;
        while(n!=0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
