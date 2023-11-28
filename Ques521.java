class Ques521 {
    public static void main(String[], args){
        System.out.println(findLUSlength(#String, #String));
    }
    public static int findLUSlength(String a, String b) {
        if(a.equals(b))
        {
            return -1;
        }
        return Math.max(a.length(),b.length());
    }
}
