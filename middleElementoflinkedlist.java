public class middleElementoflinkedlist {
    public static void main(String[] args) {
        Node head = null;
        head =new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next =new Node(40);
       // head.next.next.next.next = new Node(50);
        middleElement(head);
        //print(head);

    }
    public static void middleElement(Node head)
    {
//naive approach    
    //    int count =0;
    //     Node curr=head;
    //     while(curr.next!=null)
    //     {
    //         curr =curr.next;
    //         count++;
    //     }
    //     curr=head;
        
    //     for(int i=0; i<count/2; i++)
    //     {
    //         curr =curr.next;
    //     }
    //   System.out.println(curr.data+"");
    Node slow =head;
    Node fast =head;
    while(fast!=null && fast.next!=null )
    {
        slow=slow.next;
        fast=fast.next.next;
    }
   
    System.out.println(slow.data+"");
       
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
