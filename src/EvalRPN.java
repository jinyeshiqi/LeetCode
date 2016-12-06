import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by jinzichen on 2016/12/7.
 *
 * 150. Evaluate Reverse Polish Notation
 * https://leetcode.com/problems/evaluate-reverse-polish-notation/
 */
public class EvalRPN {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return -1;
        }
        Set<Character> operators = new HashSet<>();
        operators.add('+');
        operators.add('-');
        operators.add('*');
        operators.add('/');

        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            char c = s.charAt(0);
            if (s.length() == 1 && operators.contains(c)) {
                if (stack.size() < 2) {
                    return -1;
                }
                int b = stack.pop();
                int a = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        if (b == 0) {
                            return -1;
                        }
                        stack.push(a / b);
                        break;
                    default:
                        return -1;
                }
            } else {
                stack.push(Integer.valueOf(s));
            }
        }

        if (stack.size() != 1) {
            return -1;
        }
        return stack.pop();
    }

//    public int evalRPN(String[] tokens) {
//        if (tokens == null || tokens.length == 0) {
//            return -1;
//        }
//
//        Stack<Integer> stack = new Stack<>();
//        for (String s : tokens) {
//            try {
//                int num = Integer.parseInt(s);
//                stack.push(num);
//            } catch (NumberFormatException e) {
//                if (stack.size() < 2) {
//                    return -1;
//                }
//                int b = stack.pop();
//                int a = stack.pop();
//                switch (s) {
//                    case "+":
//                        stack.push(a + b);
//                        break;
//                    case "-":
//                        stack.push(a - b);
//                        break;
//                    case "*":
//                        stack.push(a * b);
//                        break;
//                    case "/":
//                        if (b == 0) {
//                            return -1;
//                        }
//                        stack.push(a / b);
//                        break;
//                    default:
//                        return -1;
//                }
//            }
//        }
//
//        if (stack.size() != 1) {
//            return -1;
//        }
//        return stack.pop();
//    }
}
