import java.util.*;
public class StackUsingQueues {
    private final Queue<Integer> q=new ArrayDeque<>();
    public void push(int x){q.offer(x);for(int i=0,n=q.size()-1;i<n;i++)q.offer(q.poll());}
    public int pop(){return q.remove();}
    public int top(){return q.element();}
    public boolean empty(){return q.isEmpty();}
    public static void main(String[] args){StackUsingQueues s=new StackUsingQueues();s.push(1);s.push(2);System.out.println(s.pop());}
}