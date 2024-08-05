
package VerificadoresParentesis;

import java.util.Stack;


public class VerificadorParentesis {
     public static boolean verificar(String expresion) {
        Stack<Character> stack = new Stack<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(') {
                stack.push(c); 
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false; 
                }
                stack.pop(); 
            }
        }
        return stack.isEmpty(); 
    }
}
