public class Stack {
    public static void main(String[] args) {
        mystack s =new mystack(5);
       s.push(115);
       s.push(5);
        s.push(10);
       
       System.out.println(s.size());
       s.pop();
      System.out.println(s.pop());
      s.pop();
      s.pop();
      System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
    
}
class mystack
{
    int arr[];
    int top;
    int cap;
   mystack(int c)
   {
    top=-1;// empty stack
    cap =c;
    arr =new int[cap];

   }
   void push(int x)
   {
    if(top==cap-1){
        System.out.println("Stack is full");
        return;
    }

     top++;
     arr[top] =x;



   }
   int pop()
   {
    if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
    int res =arr[top];
    top--;
    return res;
   }
  int size()
  {
    return top+1;
  }
  int peek()
  {
    if(top==-1){System.out.println("Stack is Empty");return Integer.MIN_VALUE;}
    return top+1;
  }
  boolean isEmpty()
  {
    return top==-1;
  }

}
