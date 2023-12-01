public class Ques1662 {
    public static void main(String[] args) {
        String[] one ={"ab", "c"};
        String[] two ={"a","bc"};
        System.out.println(arrayStringsAreEqual(one,two));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1="";
        String w2="";
        for (int i = 0; i < word2.length; i++) {
            w2=w2+word2[i];
        }
        for (int j = 0; j < word1.length; j++) {
            w1=w1+word1[j];
        }
        return w2.equals(w1);
    }
}
