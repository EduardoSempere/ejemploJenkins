import java.util.Stack;

public class Brackets {
 
    public static void main(String[] args) {
        
        System.out.println(solution2("{[()()]}"));
        System.out.println(solution2("([)()]"));
        System.out.println(solution2(")("));
        System.out.println(solution2("(()(())())"));
        System.out.println(solution2("())"));
    }

    public static int solution2(String S) {

        Stack<Character> stack = new Stack<Character>();
        char[] Schar = S.toCharArray();
        int result = 1;
        for (int i = 0; i < Schar.length; i++) {
            char c = Schar[i];
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    result = 0;
                    break;
                }
                switch (c) {
                    case '}':
                        operacion(stack, Schar[i], '{');
                        break;
                    case ')':
                        operacion(stack, Schar[i], '(');
                        break;
                    case ']':
                        operacion(stack, Schar[i], '[');
                        break;

                }
            }

        }

        if (stack.size() > 0) {
            result = 0;
        }

        return result;

    }
    private static void operacion(Stack<Character> stack, Character elDelString, Character elBuscado) {

        if (estaElcorrespondiente(stack, elBuscado)) {
            stack.pop();
        }
    }

 

    private static boolean estaElcorrespondiente(Stack<Character> stack, Character c) {
        Character peek = stack.peek();
        if (peek.equals(c)) {
            return true;
        } else {
            return false;
        }
    }
}
