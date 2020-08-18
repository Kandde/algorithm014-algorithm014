package action.isvalid;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 *
 * @author zhaohongxin
 */
public class IsValid {
    public boolean isValid(String s) {
        Map<Character,Character> pairs = new HashMap<Character,Character>();
        pairs.put('(', ')');
        pairs.put('{', '}');
        pairs.put('[', ']');
        Stack<Character> values = new Stack<>();
        for (int i = 0; i < s.length(); i ++) {
            if (values.size() == 0) {
                values.push(s.charAt(i));
                continue;
            }
            if (pairs.containsKey(s.charAt(i))) {
                values.push(s.charAt(i));
            } else {
                Character peek = values.peek();
                if (pairs.get(peek) != null && s.charAt(i) == pairs.get(peek)) {
                    values.pop();
                } else {
                    values.push(s.charAt(i));
                }
            }
        }
        return values.size() == 0;
    }
}
