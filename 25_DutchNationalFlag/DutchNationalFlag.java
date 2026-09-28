import java.util.Arrays;
public class DutchNationalFlag {
    public static void sort(int[] a){int l=0,m=0,r=a.length-1;while(m<=r){if(a[m]==0)swap(a,l++,m++);else if(a[m]==1)m++;else swap(a,m,r--);}}
    static void swap(int[]a,int i,int j){int t=a[i];a[i]=a[j];a[j]=t;}
    public static void main(String[] args){int[]a={2,0,2,1,1,0};sort(a);System.out.println(Arrays.toString(a));}
}