public class CircularLikedlistquestion {
    public static void main(String[] args) {
        Node head =new Node(30);
      
        head.next =new Node(20);
         head.next.next = new Node(40);
         head.next.next.next =head;
      //  circularprint(head);
      //System.out.println(lenghofcircular(head));
    // System.out.println(checkCircular(head));
    //head =headInsert(head,5);
    //head =insertAtanypo(head, 2,5);
   // head =taildelete(head);
   head =deleteAtanyposition(head,2);
    circularprint(head);
    }
    public static void circularprint(Node head)
    {
        Node curr=head;
       do
        {
            System.out.println(curr.data+"");
            curr =curr.next;
        }while(curr!=head);
    }
    public static int lenghofcircular(Node head)
    {
       
        Node curr=head;
        int count =1;
        while(curr!=head)
        {
            curr =curr.next;
            count++;
        }
            return count;
    }
    public static boolean checkCircular(Node head)
    {
        if(head == null) return false;
        Node curr =head;
    
        while(curr!=null)
        {
            curr =curr.next;
            if(curr==head)
              return true;
           
           
        }
        return false;
    }
    public static Node headInsert(Node head,int data)
    {
        Node temp =new Node(data);
        Node curr =head;
        while(curr.next!=head)
        {
            curr =curr.next;
        }
        curr.next =temp;
        temp.next=head;
        return head;
    }
    //insert ata anyposition
    public static Node insertAtanypo(Node head,int pos,int data)
    {
        Node temp=new Node(data);
        Node curr=head;
        int count =1;
        while(curr!=head)
        {
            curr =curr.next;
            count++;
        }
        if(pos>count){
            return head;
        }
        Node first =head;
        for(int i=0;i<pos-1 ; i++){
            first =first.next;
        }
        temp.next =first.next;
        first.next =temp;
        return head;

    }
    public static Node taildelete(Node head)
    {
        Node curr  =head;
        while(curr.next.next!=head)
        {
            curr=curr.next;
        }
        curr.next =head;
        return head;
    }
    public static Node deleteAtanyposition(Node head,int pos)
    {
       
        Node curr=head;
        if(pos==1)
        {
                while(curr.next!=head){
          curr=curr.next;
      }
      
      curr.next=curr.next.next;
      
      return curr.next;
        }
        if(head==null)
             return null;

       int count =1;
       while(curr.next!=head)
       {
           curr =curr.next;
           count++;
       }
       
       if(pos>count){
           return head;
       }
       curr =head;
       for(int i=1;i<pos-1; i++){
        curr =curr.next;
       }
       curr.next =curr.next.next;
       return head;
    }
}
class Node{
    int data;
    Node next;
    Node(int x)
    {
        data =x;
        next =null;
    }
}
