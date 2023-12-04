public class Ques1903 {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("52376"));
    }
    public static String largestOddNumber(String num) {
        for (int i = num.length()-1; i>-1; i--) {
            if((num.charAt(i)-'0') %2==1){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}
