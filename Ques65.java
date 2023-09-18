class Solution {
    public static void main(String[] args){
        System.out.println(isNumber(//Any string)
    }  
    public static boolean isNumber(String s) {
        s = s.trim();
        int n = s.length();
        boolean seenDigit = false;
        boolean seenE = false;
        boolean seenDot = false;
        
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                seenDigit = true;
            } else if (c == 'e' || c == 'E') {
                if (seenE || !seenDigit) {
                    return false;
                }
                seenE = true;
                seenDigit = false; // Reset the seenDigit flag for the exponent part
            } else if (c == '.') {
                if (seenDot || seenE) {
                    return false;
                }
                seenDot = true;
            } else if (c == '+' || c == '-') {
                // Sign characters are only allowed at the beginning or right after 'e'/'E'
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else {
                return false; // Invalid character
            }
        }
        
        // A valid number must have at least one digit and cannot end with 'e'/'E'
        return seenDigit && !s.endsWith("e") && !s.endsWith("E");
    }
}
