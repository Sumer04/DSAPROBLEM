public class reversedoublyLinkedlist {
    public static void main(String[] args) {
        Node head =new Node(10);
        Node temp1=new  Node(20);
        Node temp2 = new Node(30);
        Node temp3 =new Node(40);
        head.next =temp1;
        temp1.pre=head;
        temp1.next = temp2;
        temp2.pre=temp1;
        temp2.next =temp3;
        temp3.pre = temp2;
        head=reverseDoubly(head);
        print(head);
    }
    public static void print(Node head)
    {
    Node curr =head;
    do{
         System.out.println(curr.data+"");
        curr =curr.next;
    }while(curr!=null);
}
public static Node reverseDoubly(Node head)
{
    if(head==null||head.next==null)
    {
        return head;
    }
   
    Node curr =head;
    Node pre =null;
    while(curr!=null)
    {
       
     pre =curr.pre;
     curr.pre =curr.next;
     curr.next =pre;
     curr =curr.pre;

    }
    return pre.pre;
}
    
}


class Node{
    int data;
    Node pre;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
        pre =null;
    }
}
