public class MaximumProductSubarray {
    public static int maxProduct(int[] a) {
        int max=a[0],min=a[0],ans=a[0];
        for(int i=1;i<a.length;i++) {
            if(a[i]<0){int t=max;max=min;min=t;}
            max=Math.max(a[i],max*a[i]); min=Math.min(a[i],min*a[i]); ans=Math.max(ans,max);
        }
        return ans;
    }
    public static void main(String[] args){System.out.println(maxProduct(new int[]{2,3,-2,4}));}
}