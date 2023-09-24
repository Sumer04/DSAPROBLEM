public class deletefirstelementlinkedlist {
    public static void main(String[] args) {
        Node head = null;
        head =new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        //head =deleteElement(head);
        head =delteElement(head);
        print(head);

    }
    public static Node deleteElement(Node head)
    {
       // head =head.next;
       if(head==null)
       {
        return head;
       }
       
        return head.next;
    
    }
    public static Node delteElement(Node head)
    {
        if(head==null)
        {
            return null;

        }
        if(head.next==null)
        {
            return null;
        }
        Node curr =head;
        while(curr.next.next!=null)
        {
            curr =curr.next;
        }
               curr.next =null;
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
