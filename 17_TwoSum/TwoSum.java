import java.util.*;
public class TwoSum {
    public static int[] twoSum(int[] a,int target) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<a.length;i++){int need=target-a[i];if(m.containsKey(need))return new int[]{m.get(need),i};m.put(a[i],i);}
        return new int[0];
    }
    public static void main(String[] args){System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));}
}