public class removeduplicatefromlinkedlist {
    public static void main(String args[])
    {
        Node head = null;
        head =new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next =new Node(30);
       head = removeduplicate(head);
        print(head);
    }
    public static Node removeduplicate(Node head)
    {
       Node curr =head;
       while(curr!=null&&curr.next!=null)
       {
         
        if(curr.data==curr.next.data)
        {
            //System.out.println(curr.data+"");
            curr.next=curr.next.next;
        }
        else{
            curr = curr.next;
        }

       }
       return head;
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