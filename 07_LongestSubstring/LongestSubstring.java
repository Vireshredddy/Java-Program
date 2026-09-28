import java.util.*;

public class LongestSubstring {
    public static int length(String s) {
        Set<Character> set=new HashSet<>(); int left=0,max=0;
        for(int right=0;right<s.length();right++) {
            char c=s.charAt(right);
            while(set.contains(c)) { set.remove(s.charAt(left++)); }
            set.add(c); max=Math.max(max,right-left+1);
        }
        return max;
    }
    public static void main(String[] args) { System.out.println(length("abcabcbb")); }
}