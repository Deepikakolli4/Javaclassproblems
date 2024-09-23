import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String input = "{()}";
       boolean result = isValidParenthesis(input);
       System.out.println(result);
    }
    public static boolean isValidParenthesis(String s){
        Stack<Character> st = new Stack<>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{') {
                st.push(it);
            } else {
                if (st.empty()) {
                    return false;
                }
                char c = st.pop();
                if ((it == ')' && c != '(') || (it == ']' && c != '[') || (it == '}' && c != '{')) {
                    return false;
                }
            }
        }
        return st.empty();
    }
}
