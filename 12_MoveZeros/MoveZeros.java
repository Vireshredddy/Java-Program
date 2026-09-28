import java.util.Arrays;
public class MoveZeros {
    public static void move(int[] a) {
        int p=0; for(int x:a) if(x!=0) a[p++]=x;
        while(p<a.length) a[p++]=0;
    }
    public static void main(String[] args) { int[] a={2,3,0,1,0,1,2,0,6}; move(a); System.out.println(Arrays.toString(a)); }
}