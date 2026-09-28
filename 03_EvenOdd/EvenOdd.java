import java.util.*;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void streams(List<Integer> nums) {
        Map<Boolean,List<Integer>> m=nums.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("Even: "+m.get(true)); System.out.println("Odd: "+m.get(false));
    }
    public static void main(String[] args) { streams(Arrays.asList(1,2,3,4,5,6)); }
}