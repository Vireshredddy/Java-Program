import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static Character loop(String s) {
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i); int count=0;
            for (int j=0;j<s.length();j++) if (s.charAt(j)==c) count++;
            if (count==1) return c;
        }
        return null;
    }
    public static Character stream(String s) {
        Map<Character,Long> m=s.chars().mapToObj(c->(char)c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        return s.chars().mapToObj(c->(char)c).filter(c->m.get(c)==1).findFirst().orElse(null);
    }
    public static void main(String[] args) { System.out.println(loop("Swiss")); System.out.println(stream("Swiss")); }
}