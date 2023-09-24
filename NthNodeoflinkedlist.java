public class NthNodeoflinkedlist {
    public static void main(String[] args) {
        Node head = null;
        head =new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next =new Node(40);
        Nthnode(head,1);

    }
    public static void Nthnode(Node head,int n)
    {
        //first soliution 
        // int  count =0;
        // Node curr =head;
        // while(curr.next!=null)
        // {
        //     curr=curr.next;
        //     count++;

        // }
        // if(count<n)
        // {
        //     return;
        // }
        // curr=head;
        // for(int i=0; i<count-(n-1); i++)
        // {
        //     curr=curr.next;
        // }
        // System.out.println(curr.data+"");
        // second solution we dont count length of list
        if(head==null)
        {
            return;
        }
        Node first = head;
        for(int i =0; i<n; i++)
        {
            if(first==null)
            {
                return;
            }
            first =first.next;
        }
        Node second = head;
        while(first!=null)
        {
            second =second.next;
            first=first.next;
        }
        System.out.println(second.data+"");

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
