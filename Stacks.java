import java.util.Stack;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Stacks {

    public static void main(String[] args) throws ScriptException {
        System.out.println(solution("+*23/15"));
        System.out.println(solution("-*+4325"));
        System.out.println(solution("+3*32"));
    }

    public static String solution(String str) throws ScriptException {
        Stack op = new Stack();
        String num = "";
        char[] ch = str.toCharArray();
        String opAcetados = "+-*/";
        for (int i = 0; i < ch.length; i++) {
            if (opAcetados.indexOf(ch[i]) >= 0) {
                op.push(ch[i]);
            } else {
                num = num + ch[i];
                if (!op.isEmpty()) {
                    num = num + op.pop();
                }
            }
        }
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
         System.out.println(num);
        return engine.eval(num).toString();
    }
}
