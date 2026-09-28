public class ReverseLinkedList {
    static class Node {int data;Node next;Node(int d){data=d;}}
    public static Node iterative(Node head){Node prev=null,cur=head;while(cur!=null){Node next=cur.next;cur.next=prev;prev=cur;cur=next;}return prev;}
    public static Node recursive(Node head){if(head==null||head.next==null)return head;Node h=recursive(head.next);head.next.next=head;head.next=null;return h;}
}