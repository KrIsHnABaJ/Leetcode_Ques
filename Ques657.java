public class Ques657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("LDRRLRUULR"));
    }
    public static boolean judgeCircle(String moves) {
        int countUP=0;
        int countLR=0;
        // for (int i = 0; i < moves.length(); i++) {
        //     if(moves.charAt(i)=='U'){
        //         countUP++;
        //     }
        //     if(moves.charAt(i)=='D'){
        //         countUP--;
        //     }
        //     if(moves.charAt(i)=='L'){
        //         countLR++;
        //     }
        //     if(moves.charAt(i)=='R'){
        //         countLR--;
        //     }
        // }
        
        
        //faster approach

        for (char c : moves.toCharArray()) {
            if (c=='D'){
                countUP++;
            }
            else if(c=='U'){
                countUP--;
            }
            else if(c=='R'){
                countLR++;
            }
            else if(c=='L'){
                countLR--;
            }
        }
        return countUP==0&&countLR==0;
    }
}

