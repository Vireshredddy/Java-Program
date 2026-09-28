public class ReverseWords {
    public static String reverseEach(String s) {
        String[] words=s.split(" "); StringBuilder out=new StringBuilder();
        for(String w:words) out.append(new StringBuilder(w).reverse()).append(' ');
        return out.toString().trim();
    }
    public static String reverseOrder(String s) {
        String[] w=s.split(" "); StringBuilder out=new StringBuilder();
        for(int i=w.length-1;i>=0;i--) out.append(w[i]).append(i==0?"":" ");
        return out.toString();
    }
    public static void main(String[] args) { System.out.println(reverseEach("Hello world")); }
}