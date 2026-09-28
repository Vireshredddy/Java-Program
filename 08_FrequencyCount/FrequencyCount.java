import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCount {
    public static Map<Character,Long> chars(String s) {
        return s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
    }
    public static void main(String[] args) { System.out.println(chars("banana")); }
}