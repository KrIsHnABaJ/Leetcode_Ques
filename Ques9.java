
public class Ques9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        String a = String.valueOf(x);
        String rev ="";
        for (int index = 0; index < a.length(); index++) {
            rev = a.charAt(index)+rev;
            int r =Integer.parseInt(rev);
            if(r==x){
                return true;
            }
            

        }
        return false;
    }
        
}

