import java.util.LinkedList;
import java.util.Queue;

public class largestpathofsumfromnode {

    public static void main(String s[])
    {
       Node root = new Node(10);
	root.left = new Node(2);
 	root.right=new Node(-25);
	root.left.left =new Node(20);
        root.left.right = new Node(1);
        root.right.left  = new  Node(3);
        root.right.right = new Node(4);
 
      }
   


}
    
class Node
{
    int data;
    Node left;
    Node right;
    Node(int x)
    {
         data =x;
         left =null;
         right =null;
    }
}
