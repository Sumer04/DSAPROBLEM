public class SingleLinkList1 {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next =new Node(20);
        head.next.next =new Node(30);

        rprint(head);
    }
    public static void rprint(Node head)
    {
        if(head==null)
        {
            return;
        }
        System.out.println(head.data+"");
        rprint(head.next);
    }
    
}
class Node
{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;

    }
}
