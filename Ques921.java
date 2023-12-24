import java.util.Stack;

public class Ques921 {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid(")(())"));
    }
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack =new Stack<>();
        char[] c =s.toCharArray();
        for(char i: c){
            if(i==')'){
                if(!stack.isEmpty()&&stack.peek()=='('){
                    stack.pop();
                }else{
                    stack.push(i);
                }
            }else{
                stack.push(i);
            }

        }
        return stack.size();
    }
}
