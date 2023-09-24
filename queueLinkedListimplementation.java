import java.net.SocketImpl;
import java.net.SocketTimeoutException;

public class queueLinkedListimplementation {
    public static void main(String[] args) {
     queue q = new queue();
     q.queue1(10);
     q.queue1(20);
  q.queue1(30);
  q.queue1(40);
  //System.out.println(q.front.data);
  //System.out.println(q.rear.data);
  q.dequeue();
  System.out.println(q.front.data);
  System.out.println(q.rear.data);
  System.out.println(q.getSize());

    
       
    }
    
}
class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data =x;
        next =null;
    }
}
class queue{
    Node front;
    Node rear;
    int size;
  
    queue()
    {
     front =rear=null;
     size =0;
    }
    void queue1(int x){
        Node temp =new Node(x);
        size++;
        if(front==null)
        {
           front =rear=temp;
           return;
        }
      rear.next =temp;
      rear =temp;
    }
    void dequeue()
    {
        if(front ==null)
        {
            return;
        }
        size--;
        front =front.next;
        if(front==null){
            rear=null;
        }
    }
     int getSize()
     {
        return size;
     }

}
