public class Ques7 {
    public static void main(String[] args) {
        System.out.println(reverse(120));
    }
    public  static int reverse(int x) {
        
        String rev ="";
        int r;
        if(x<0){
            int num =x*-1;
            String str =String.valueOf(num);
            
            for (int i = 0; i < str.length(); i++) {
                rev= str.charAt(i)+rev;                
            }
            r=Integer.parseInt(rev);
            return r*-1;
        }
        else{
            String str =String.valueOf(x);
            
            for (int i = 0; i < str.length(); i++) {
                rev= str.charAt(i)+rev;                
            }
            r=Integer.parseInt(rev);
            return r;
        }
        
    }
}
