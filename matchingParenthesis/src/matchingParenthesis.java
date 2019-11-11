import java.util.Stack;

public class matchingParenthesis {

    public static void main(String[] args) {
        String parenthesis = "())(())(()";
        System.out.println(isMatchingParenthesis(parenthesis));
    }

    public static boolean isMatchingParenthesis(String parenthesis) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < parenthesis.length(); i++) {
            if (parenthesis.charAt(i) == '(') {
                stack.push(parenthesis.charAt(i));
            } else if (!stack.empty()){
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.empty();
    }
}
