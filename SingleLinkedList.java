import javax.print.event.PrintJobListener;

public class SingleLinkedList {
    public static void main(String[] args) {
        sumer head =new sumer(10);// we replace  sumer with anything
        // sumer Temp1 = new sumer(20);
        // sumer Temp2=new sumer(30);
        // head.next =Temp1;
        // Temp1.next = Temp2;
        head.next = new sumer(20);
        head.next.next =new sumer(30);
        head.next.next.next=new sumer(40);
        printList(head);
        
    }
    public static void printList(sumer head)
{
          sumer curr = head;
          while(curr!=null){
            System.out.println(curr.data+"");
            curr=curr.next;
          }
}
}
    

 class sumer{
    int data;
    sumer next;
    sumer(int x){
        data =x;
        next =null;
        //System.out.println(data);

    }

}

