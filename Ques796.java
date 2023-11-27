public class Ques796 {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
    }
    public  static boolean rotateString(String s, String goal) {
        if(s.length()==goal.length() && (s+s).contains(goal)){
            return true;
        }
        return false;
        
    }
}
