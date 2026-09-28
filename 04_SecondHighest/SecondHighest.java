import java.util.*;

public class SecondHighest {
    public static Integer find(List<Integer> nums) {
        return nums.stream().filter(Objects::nonNull).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
    }
    public static void main(String[] args) { System.out.println(find(Arrays.asList(10,20,20,5,30))); }
}