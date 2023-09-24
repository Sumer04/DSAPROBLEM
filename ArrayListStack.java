import java.util.ArrayList;

public class ArrayListStack {
    public static void main(String[] args) {
        mystack s =new mystack();
        s.push(5);
        s.push(10);
        s.push(15);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
       System.out.println( s.isEmpty());
    }
    
}
class mystack
{       ArrayList<Integer>arr =new ArrayList<>();
       
       Void push(int x)
       {
        arr.add( x);
        return null;
       }
       int pop()
       {
        int res =arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
           return res;
       }
       int peek()
       {
        return arr.get(arr.size()-1);

       }
       boolean isEmpty()
       {
        return arr.isEmpty();
       }
       int size()
       {
        return arr.size();
       }
    

}
