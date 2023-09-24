public class recursiveLinkedList {
    public static void main(String[] args) {
        Node head = null;
        head =new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next =new Node(40);
      // head = recursivereverse(head);
       head =recursive(head,null);
        print(head);
    }
    public static Node recursivereverse(Node head)
    {
        //method 1
        if(head==null||head.next==null)
        {
          return head;
        }
         Node rehead = recursivereverse(head.next);
        Node retail = head.next;
        retail.next =head;
        head.next=null;
        return rehead;

    }
    public static Node recursive(Node curr,Node pre)
    {
           if(curr==null)
           {
            return pre;
           }
           Node next=curr.next;
           curr.next =pre;
           return recursive(next,curr);
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
