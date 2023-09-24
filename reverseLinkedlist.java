import java.util.ArrayDeque;
import java.util.ArrayList;

public class reverseLinkedlist {
    public static void main(String[] args) {
        Node head = null;
        head =new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next =new Node(40);
       // print(head);
        //head =reverseList(head);
        head =efficient(head);
        print(head);
    }
    // naive solution
    public static Node reverseList(Node head)
    {
     ArrayList<Integer>arr = new ArrayList<Integer>();
     for(Node curr=head;curr!=null;curr=curr.next){
        arr.add(curr.data);
    }
    for(Node curr=head;curr!=null;curr=curr.next){
        curr.data=arr.remove(arr.size()-1);
    }
    return head;
    }
    // efficientsolution
    public static Node efficient(Node head)
    {
        Node curr=head;
        Node pre =null;
        while(curr!=null)
        {

            Node next = curr.next;
            curr.next = pre;
            pre =curr;
            curr= next;

        }
        return pre ;
           
    }
    public static void print(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.println(curr.data+"");
            curr=curr.next;
        }
    }
}
class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
