public class doublyLinkedList {
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
        int data =5;
       // head =insertAtbegin(head, data);
      // head =insertAttheend(head, data);
       //head =delete(head);
       head =deletefromend(head);
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
public static Node insertAtbegin(Node head,int data)
{
    Node temp =new Node(data);
    if(head==null)
    {
        return temp;
    }
    temp.next =head;
    head.pre =temp;
    return temp;
}
public static Node insertAttheend(Node head,int data)
{
    Node temp =new Node(data);
    if(head==null)
    {
        return temp;
    }
    Node curr =head;
    while(curr.next!=null)
    {
        curr =curr.next;
    }
    curr.next =temp;
    temp.pre =curr;
    return head;
}
//delete
public static Node delete(Node head)
{
    if(head==null)
    {
        return null;
    }
    if(head.next ==head)
    {
        return null;
    }
    head=head.next;
    head.pre=null;
    return head;
}
// delete from end
public static Node deletefromend(Node head)
{
    Node curr =head;
    if(head==null)
    {
        return null;

    }
    if(head.next==null)
    {
        return null;
    }
    while(curr.next.next!=null)
    {
        curr =curr.next;
    }
    curr.next=null;
  
    return head;

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
