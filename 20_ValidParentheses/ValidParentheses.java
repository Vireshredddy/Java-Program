import java.util.*;
public class ValidParentheses {
    public static boolean valid(String s){
        Map<Character,Character> m=Map.of(')','(','}', '{',']','['); Deque<Character> st=new ArrayDeque<>();
        for(char c:s.toCharArray()){if(m.containsValue(c))st.push(c);else if(m.containsKey(c)&&(st.isEmpty()||st.pop()!=m.get(c)))return false;}
        return st.isEmpty();
    }
    public static void main(String[] args){System.out.println(valid("{[()]}"));}
}