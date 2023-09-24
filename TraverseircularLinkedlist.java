public class TraverseircularLinkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(60);
        head.next.next = new Node(40);
        head.next.next.next = new Node(70);  
        head.next.next.next.next=head; 
        traverse(head); 
        traverse1(head);  
    }
    public static void traverse(Node head)
    {
        // method 1
        if(head==null)
        return;
        Node curr =head;
        while(curr.next!=head)
        {
            System.out.println(curr.data+"'");
            curr =curr.next;
        }
        System.out.println(curr.data+"");

       

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
