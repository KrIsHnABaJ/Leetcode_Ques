public class Ques6 {
    public static void main(String[] args) {
        
    }
    public static String convert(String s, int numRows) {
        int l =s.length();
        StringBuffer [] arr =new StringBuffer[numRows];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new StringBuffer();
        }
        int count =0;
        while(count<l){
            for (int i = 0; i < numRows && count<l; i++) {
                arr[i].append(s.charAt(l++));
            }

            for (int i = numRows-2; i>=0; i--) {
                arr[i].append(s.charAt(l++));
            }
        }
        StringBuffer ans = new StringBuffer();
        for (StringBuffer stringBuffer : arr) {
            ans.append(stringBuffer);
        }
        return ans.toString();
    }
}
