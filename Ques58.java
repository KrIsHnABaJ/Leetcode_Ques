class Solution {
    public int lengthOfLastWord(String s) {
        int lenthOfLastWord = 0;

        // we need last word so let traverse from last to first
        for(int i=s.length()-1;i>=0;i--) {
            // if our char is not space then it will defenately a word
            if(s.charAt(i)!=' ') {
                //counting the length
                lenthOfLastWord++;
            }else{
                // if " " space comes after word we only need to return the length of the word
                if(lenthOfLastWord>0) return lenthOfLastWord;
            }
        }
        // if string contains only single word then this return works...
        return lenthOfLastWord;
    }
}
