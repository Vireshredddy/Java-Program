public class KadanesAlgorithm {
    public static int maxSum(int[] a) {
        int current=a[0], max=a[0];
        for(int i=1;i<a.length;i++) { current=Math.max(a[i],current+a[i]); max=Math.max(max,current); }
        return max;
    }
    public static void main(String[] args) { System.out.println(maxSum(new int[]{-2,1,-3,4,-1,2,1,-5,4})); }
}