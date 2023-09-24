public class Jointwolinkedlistquestion {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        
       head1.next.next.next.next = new Node(600);
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
       // head1=jointwolinkedlist(head1, head2);
       // head1=remove(head1);
      // head1=reverseLinklist(head1);
      //  print(head1);
       // System.out.println(identifical(head1, head2));
       NtHNodefrom(head1, 3);
    }
    public static void print(Node head1)
    {
        Node curr =head1;
        while(curr!=null)
        {
            System.out.println(curr.data+"");
            curr =curr.next;
        }
    }
    public static Node jointwolinkedlist(Node head1,Node head2)
    {
        Node curr =head1;
        while(curr.next!=null)
        {
            curr =curr.next;
        }
        curr.next =head2;
        return head1;
    }
    // remove duplicate from linked list
    public static Node remove(Node head1)
    {
        Node curr =head1;
       // Node first =head1.next;
        while(curr.next!=null )
        { 
           if(curr.data==curr.next.data)
           {
            curr.next =curr.next.next;
           }
            else{
                curr =curr.next;
            }
               
            
        }
        return head1;
    }
    public static boolean identifical(Node head1,Node head2)
    {
        boolean ans =false;
        Node curr1 =head1;
        Node curr2=head2;
        int count1 =0;
        int count2=0;
        while(curr1!=null){
            curr1 =curr1.next;
            count1++;

        }
        while(curr2!=null){
            curr2 =curr2.next;
            count2++;
        }
        if(count1==count2){
              return ans;
        }
        while(curr1!=null)
        {
            if(curr1.data==curr2.data)
            {
                ans =true;
            }
            else{
                ans=false;
                break;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        
        return ans;
    }
    public static Node reverseLinklist(Node head1)
    {
    Node curr =head1;
    Node pre =null;
    while(curr.next!=null){
          Node temp =curr.next;
          curr.next =pre;
          pre =curr;
          curr=temp;
    }
          return pre;





    }
    public static void NtHNodefrom(Node head1,int n)
    {
       Node curr =head1;
       int count =0;
       while(curr!=null)
       {
        count++;
        curr =curr.next;
       // count++;
       }
       if(n>count){
        return;
       }
       curr =head1;
       for(int i=1; i<count-n+1; i++)
       {
        curr =curr.next;
       }
       System.out.println(curr.data+"");
    
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

