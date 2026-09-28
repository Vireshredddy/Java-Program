public class MinimumSizeSubarraySum {
    public static int minLen(int target,int[] a){int left=0,sum=0,min=Integer.MAX_VALUE;for(int r=0;r<a.length;r++){sum+=a[r];while(sum>=target){min=Math.min(min,r-left+1);sum-=a[left++];}}return min==Integer.MAX_VALUE?0:min;}
    public static void main(String[] args){System.out.println(minLen(7,new int[]{2,3,1,2,4,3}));}
}