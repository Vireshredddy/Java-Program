import java.util.Arrays;
public class ProductExceptSelf {
    public static int[] product(int[] a) {
        int[] out=new int[a.length]; int p=1;
        for(int i=0;i<a.length;i++){out[i]=p;p*=a[i];}
        p=1; for(int i=a.length-1;i>=0;i--){out[i]*=p;p*=a[i];}
        return out;
    }
    public static void main(String[] args){System.out.println(Arrays.toString(product(new int[]{1,2,3,4})));}
}