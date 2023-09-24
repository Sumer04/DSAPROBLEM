import java.util.LinkedList;
import java.util.Queue;

public class binarytreeintoddl {
    static Node prev =null;
  static Node head;
  Node root;
    public static void main(String[] args) {
       binarytreeintoddl tree = new binarytreeintoddl();
       tree. root = new Node(10);
       tree. root.left =new Node(20);
       tree. root.left.left = new Node(40);
       tree. root.left.right = new Node(60);
       tree. root.right = new Node(30);
       tree.binaryintoddl(tree.root);
       tree.printList(tree.head);

   
    }
    void printList(Node root)
    {
        while (root != null)
        {
            System.out.print(root.data + " ");
            root = root.right;
        }
    }
    

    

    public static void binaryintoddl(Node root)
    {
     if(root==null)
     {
        return ;

     }
     binaryintoddl(root.left);
     if(prev ==null)
     {
        head =root;
     }
     else{
        root.left = prev;
        prev.right = root;
     }
     prev = root;
     binaryintoddl(root.right);
     

     
       
     
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
 






