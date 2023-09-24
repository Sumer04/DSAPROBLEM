import java.util.function.DoubleToIntFunction;

public class InsertelementatStart {
    public static void main(String[] args) {
        Node head=null;
        head = new Node(10);
        head.next = new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(50);
        int x=5;
        //int pos =2;
      // head =  InsertAtbegin(head, x);
      // head =InsertAtbegin(head,40);
       //head =InsertAtend(head,x);
      // head =InsertAtposition(head, x, pos);
       head=InsertSorted(head, x);
       print(head);
      
    }
    public static Node InsertAtbegin(Node head, int x){
        Node curr =new Node(x);
        curr.next=head;
       
        return curr;
        
        
    }
    // insertAtend
    public static Node InsertAtend(Node head ,int x){
       Node temp = new Node(x);
       if(head==null){
        return temp;
       }
       Node curr=head;
       while(curr.next!=null)
       {
        curr=curr.next;
       }
       curr.next=temp;
       return head;

    }   
    //insert at the position
    public static Node InsertAtposition(Node head,int x,int pos)
    {
        Node temp = new Node(x);
        if(pos==1){
            temp.next=head;
            return temp;
        }
        Node curr = head;
        for(int i=0; i<pos-1 && curr!=null; i++)
        {
            curr =curr.next;

        }
        if(curr==null){
            return head;
        }
        temp.next =curr.next;
        curr.next = temp;
        return head;

    }
    // insert sorted in linked list
    public static Node InsertSorted(Node head ,int x)
    {
        Node temp = new Node(x);
        if(head ==null)
        {
            return temp;
        }
        if(x<head.data)
        {
            temp.next =head;
            return temp;
        }
        Node curr=head;
        while(curr.next!=null && curr.next.data<x)
        {
            curr=curr.next;
            
        }
        temp.next =curr.next;
        curr.next =temp;
        return head;
    }
    
    public static void print(Node head){
         Node curr =head;
         while(curr!=null){
            System.out.println(curr.data+"");
            curr=curr.next;
         }
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
