public class ReverseLettersOnly {
    public static String reverse(String s) {
        char[] a=s.toCharArray(); int l=0,r=a.length-1;
        while(l<r) {
            while(l<r && !Character.isLetter(a[l])) l++;
            while(l<r && !Character.isLetter(a[r])) r--;
            char t=a[l]; a[l]=a[r]; a[r]=t; l++; r--;
        }
        return new String(a);
    }
    public static void main(String[] args) { System.out.println(reverse("a1b2c3d4e5f")); }
}