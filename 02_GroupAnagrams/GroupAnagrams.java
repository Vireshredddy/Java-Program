import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static List<List<String>> group(String[] a) {
        return new ArrayList<>(Arrays.stream(a).collect(Collectors.groupingBy(
            s -> { char[] c=s.toCharArray(); Arrays.sort(c); return new String(c); },
            LinkedHashMap::new, Collectors.toList())).values());
    }
    public static void main(String[] args) { System.out.println(group(new String[]{"eat","tea","tan","ate","nat","bat"})); }
}