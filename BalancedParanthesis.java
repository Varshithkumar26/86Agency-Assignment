import java.util.*;
public class BalancedParanthesis {
    public static String isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char c : s.toCharArray())
        {
            if(mapping.containsValue(c))
                stack.push(c);
            else if (mapping.containsKey(c))
            {
                if (stack.isEmpty() || mapping.get(c) != stack.pop())
                    return "Not Balanced";
            }
        }

        if(stack.isEmpty())
          return "Balanced";
        return "Not Balanced";
    }
    public static void main(String[] args) {
        String s1="[()]{}{[()()]()}";
        System.out.println(isBalanced(s1));

        String s2="[(])";
        System.out.println(isBalanced(s2));
    }
}
