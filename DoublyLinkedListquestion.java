import java.util.ArrayList;

public class DoublyLinkedListquestion {
    public static void main(String[] args) {
        Node head =new Node(10);
        Node temp1=new Node(20);
        Node temp2 = new Node(30);
        head.next =temp1;
        temp1.pre =head;
        temp1.next =temp2;
        temp2.pre =temp1;
        //System.out.println(printDoubleyLinkedList(head));
       // head =headinsertAtend(head, 70);
      // head=insertAtposition(head, 2, 70);
     //head =insertinSorted(head, 25);
    //  head =taildelete(head);
    head =tailHead(head);
        printt(head);
    }
    public static void printt(Node head){
        Node curr =head;
        while(curr!=null)
        {
            System.out.println(curr.data+"");
         curr =curr.next;
        }
    }
    public static ArrayList<Integer> printDoubleyLinkedList(Node head)
    {
        ArrayList<Integer>arr =new ArrayList<>();
        Node curr =head;
        while(curr!=null)
        {
         arr.add(curr.data);
         curr =curr.next;
        }
          return arr;
    }
    public static Node headInsert(Node head,int data)
    {
        Node temp =new Node(data);
        Node pre =null;
        
     temp.next =head;
     head.pre =temp;
    
   
      return temp;
    }
    //tailend
    public static Node headinsertAtend(Node head,int data)
    {
        Node temp =new Node(data);
        Node curr =head;
        while(curr.next!=null)
        {
            curr =curr.next;
        }
        curr.next =temp;
        temp.pre =curr;
        return head;
    }
    //insert Atany position
    public static Node insertAtposition(Node head,int pos,int data)
    {
        Node temp =new Node(data);
        int count =0;
        Node curr =head;
        while(curr.next!=null)
        {
            curr =curr.next;
            count++;
        }
           if(pos>count)
           {
            return head;
           }
        Node first =head;
        for(int i=0; i<pos; i++)
        {
         first =first.next;
        }
        if(first.next==null)
        {
            first.next =temp;
            temp.pre =first;
        }
          else{
         temp.next =first.next;
        first.next.pre =temp;
         first.next =temp;
         temp.pre=first;
    }
        return head;
    }
    // inserte in a sorted way
public static Node insertinSorted(Node head,int x)
{
     Node temp =new Node(x);
    Node curr =head;
    if(x<curr.data)
    {
        temp.next =head;
        head.pre =temp;
        return temp;
    }
    while(curr.next!=null)
    {
        curr =curr.next;
    }
    if(x>curr.data)
    {
        curr.next =temp;
        temp.pre =curr;
        return head;
    }
    curr =head;
    while(curr.next!=null && curr.next.data<x)
    {
        curr =curr.next;
    }
    temp.next =curr.next;
    curr.next.pre =temp;
     curr.next =temp;
     temp.pre=curr;
     return head;
}
// delete tail from dobleylinkedlist
public static Node taildelete(Node head)
{
        Node curr =head;
        while(curr.next.next!=null)
        {
            curr =curr.next;
        }
        curr.next =null;
        return head;

}
public static Node tailHead(Node head)
{ 
    if(head==null || head.next ==null)
    {
        return null;
    }
    head =head.next;
    head.pre =null;
   
  
    return head;
}
 
    
}
class Node
{
    int data;
    Node next;
    Node pre;
    Node(int x)
    {
        data=x;
        next=null;
        pre=null;
    }
}