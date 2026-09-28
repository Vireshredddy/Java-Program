import java.util.*;
import java.util.stream.*;

public class DuplicateElements {
    public static List<Integer> find(int[] a) {
        return IntStream.range(0,a.length).filter(i->IntStream.range(0,i).anyMatch(j->a[j]==a[i]))
            .mapToObj(i->a[i]).distinct().collect(Collectors.toList());
    }
    public static void main(String[] args) { System.out.println(find(new int[]{1,2,3,2,4,1,1})); }
}