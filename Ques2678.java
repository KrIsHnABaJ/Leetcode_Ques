public class Ques2678 {
    public static void main(String[] args) {
        String[] arr ={"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(arr));
    }
    public static int countSeniors(String[] details) {
        int ans=0;
        for (String string : details) {
            int count =((string.charAt(11)-'0')*10)+(string.charAt(12)-'0');
            if(count>60) ans++;
        }
        return ans;
    }
}
