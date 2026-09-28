import java.util.*;
public class MissingNumber {
    public static int missing(int[] a,int n){int expected=n*(n+1)/2;for(int x:a)expected-=x;return expected;}
    public static void main(String[] args){System.out.println(missing(new int[]{1,2,4,5},5));}
}