public class deleteHeadofcircularlinkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(60);
        head.next.next = new Node(40);
        head.next.next.next = new Node(70);  
        head.next.next.next.next=head; 
        //head =deletehead(head);
        head = deletefromAnyposition(head, 4);
        traverse1(head);
    }
    public static Node deletehead(Node head )
    {
        if(head==null)
        {
            return null;

        }
        if(head.next==head)
        {
            return null;
        }
        Node curr =head;
        while(curr.next!=head)
        {
            curr =curr.next;
        }
        curr.next = head.next;
        return head.next;
    }
    public static Node deletefromAnyposition(Node head,int k)
    {
        if(head==null)
        {
            return head;
        }
        if(k==1)
        {
            if(head==null)
            {
                return null;
    
            }
            if(head.next==head)
            {
                return null;
            }
            Node curr =head;
            while(curr.next!=head)
            {
                curr =curr.next;
            }
            curr.next = head.next;
            return head.next;
        }
        Node first =head;
        for(int i =0; i<k-2; i++)
        {
            first =first.next;
        }
       first.next =first.next.next;
    
       return head;
        
    }

    public static void traverse1(Node head)
    {
        // method 1
        if(head==null)
        return;
        Node curr =head;
      do
        {
            System.out.println(curr.data+"'");
            curr =curr.next;
        }  while(curr!=head);
        }
    }
class Node{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
