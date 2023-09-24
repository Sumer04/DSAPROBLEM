public class sumofnodesoflinkedlist {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(60);
        head.next.next = new Node(40);
        head.next.next.next = new Node(70);
        int x =90;
        int pos=3;
       // head =InsertionAtposition(head, x, pos);
      // head =deletelast(head);
     // head =deleteAtanyposition(head, pos);
      System.out.println(check(head));
      //check(head);
      //  print1(head);
        //countNodes(head);

      // maximum(head);
       // print(head);
     //serch(head, x);
    }
    public static void print(Node head)
    {
       int sum =0;
        Node curr=head;
      
        while(curr!=null)
        {
          sum =sum+curr.data;
            curr=curr.next;
         
        }
        System.out.println(sum);
    }
    public static void print1(Node head)
    {
        Node curr =head;
        while(curr!=null)
        {
            System.out.println(curr.data+"");
            curr =curr.next;
        }
        
    }
    public static void countNodes(Node head)
    {
        int count =0;
        Node curr =head;
        while(curr!=null)
        {
            curr=curr.next;
            count++;
        }
        System.out.println(count);
    }
    public static void maximum(Node head)
    {
        // Node max =head;
        // Node curr =head;
        // while(curr.next!=null)
        // {
        //     curr =curr.next;
        //     if(max.data<curr.data)
        //     {
        //         max=curr;
        //     }
        // }
        // System.out.println(max.data);
        Node min =head;
        Node curr =head;
        while(curr.next!=null)
        {
            curr =curr.next;
            if(min.data>curr.data)
            {
                min=curr;
            }
        }
        System.out.println(min.data);
    }
    public static void serch(Node head,int x)
    {
        Node curr =head;
        Boolean ans=false;
        while(curr.next!=null)
        {
            curr =curr.next;
            if(curr.data==x)
            {
                ans = true;
                break;

           }
           
       }

       System.out.println(ans);
   
    }
    public static Node InsertionAtposition(Node head,int x,int pos)
    {
        Node temp = new Node(x);
        if(pos==1){
            temp.next=head;
            return temp;
        }
        int count =0;
        Node curr =head;
        while(curr!=null)
        {
            curr =curr.next;
            count++;
        }
           if(pos>count)
           {
            return null;
           }
         curr = head;
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
    public static Node insertionSorted(Node head,int x)
    {
        Node temp =new Node(x);
        if(head==null)
        {
            return temp;
        }
        if(x<head.data)
        {
            temp.next =head;
            return temp;
        }

        Node curr =head;
        while(curr!=null&&curr.next.data<x)
        {
            curr =curr.next;
        }
        temp.next =curr.next;
        curr.next =temp;
        return head;
    }
    //delete end element
    public static Node deletelast(Node head)
    {
        Node curr =head;
        while(curr.next.next!=null)
        {
            curr =curr.next;
        }
        curr.next =null;
        return head;
    }
    public static Node deleteAtanyposition(Node head,int pos)
    {
       
        Node curr =head;
        if(pos==1)
        {
            return head.next;
        }
        
        for(int i =1; i<pos-1; i++)
        {
            curr=curr.next;
        }
        curr.next =curr.next.next;
        return head;
    }
    // check linl list is sorted or not
    public static boolean check(Node head)
    {
      boolean increasing =false;
      boolean dicreasing =false;
      Node curr =head;
      while(curr!=null && curr.next!=null &&(increasing||dicreasing) )
      {
         if(curr.data<=curr.next.data)
         {
            dicreasing =true;
            

         }
         if(curr.data>=curr.next.data)
         {
            increasing =true;
         }
         curr =curr.next;
      }
      return increasing||dicreasing;
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
