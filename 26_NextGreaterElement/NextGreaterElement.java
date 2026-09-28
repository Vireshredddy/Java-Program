import java.util.*;
public class NextGreaterElement {
    public static int[] next(int[] a){int[] r=new int[a.length];Arrays.fill(r,-1);Deque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<a.length;i++){while(!st.isEmpty()&&a[i]>a[st.peek()])r[st.pop()]=a[i];st.push(i);}return r;}
    public static void main(String[] args){System.out.println(Arrays.toString(next(new int[]{4,5,2,10,8})));}
}