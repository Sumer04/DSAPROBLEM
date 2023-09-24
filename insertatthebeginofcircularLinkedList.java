public class insertatthebeginofcircularLinkedList {
    public static void main(String[] args) {
       
         Node head = new Node(10);
        head.next = new Node(60);
        head.next.next = new Node(40);
        head.next.next.next = new Node(70);  
        head.next.next.next.next=head; 
        int x =90;
       //head =insertAtbegin(head, x);
        //head =efficient(head, x);
       // head =insertAtEnd(head, x);
      // head =efficientinseratend(head, x);
        //traverse1 (head);
        head= insertAtmiddle(head, x);
        traverse1(head);
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
    //this is naive soluyion time complexity is o(n)
    public static Node insertAtbegin(Node head,int x)
    {
        Node temp =new Node(x);
    
        if(head==null)
        {
            temp.next =temp;
            return temp;
        }
        Node curr =head;
        while(curr.next!=head)
        {
            curr =curr.next;
        }
    curr.next=temp.next;
    temp.next =head;
      return temp;
    }
    //this is efficient solution time complexity is o(1)
    public static Node efficient(Node head,int x)
    {
        Node temp = new Node(x);
        if(head==null)
        {
            temp.next =temp;
            return temp;
        }
        temp.next =head.next;
        head.next =temp;
        int t = head.data;
       head.data =temp.data;
       temp.data =t;
       return head;

    }
    public static Node insertAtEnd(Node head,int x)
    {
            Node temp = new Node(x);
            if(head==null)
            {
                temp.next =temp;
                return temp;
            }
            Node curr =head;
            while(curr.next!=head)
            {
                curr =curr.next;
            }
         curr.next =temp;
         temp.next =head;
            return head;
    }
    public static Node efficientinseratend(Node head,int x)
    {
        Node temp = new Node(x);
        if(head==null)
        {
            temp.next =temp;
            return temp;
        }
        temp.next =head.next;
        head.next =temp;
        int t = head.data;
       head.data =temp.data;
       temp.data =t;
       return temp;

    }
    public static Node insertAtmiddle(Node head,int x)
    {
        Node data = new Node(x);
        Node slow =head;
        Node fast =head;
        while(fast!=null && fast.next!=null)
        {
            slow =slow.next;
            fast =fast.next.next.next;
        }
        data.next =slow.next;
        slow.next=data;
        return head;
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

