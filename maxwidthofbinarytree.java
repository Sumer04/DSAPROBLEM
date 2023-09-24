import java.nio.channels.GatheringByteChannel;
import java.rmi.server.SocketSecurityException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class maxwidthofbinarytree {
    public static void main(String[] args) {
        Node root = new Node(15);
       root.left = new Node(5);
       root.left.left = new Node(7);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.right = new Node(85);
        root.right.left.left = new Node(16);
       //System.out.println(getMaxWidth(root));
      // System.out.println(height(root));
       //System.out.println(isBalanced(root));
     //  System.out.println(leftview(root));
     //  System.out.println(rightview(root));
    }
   static  int getMaxWidth(Node root) {
        // Your code here
        Queue<Node> q = new LinkedList<>();
        int maxwidth =0;
        q.add(root);
        if(root==null)
        {
            return 0;
        }
        while(q.isEmpty()==false)
        {
            int n = q.size();
            for(int i=0; i<n; i++)
            {
                Node curr = q.poll();
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
                maxwidth = Math.max(maxwidth,n);
            }
          //  maxwidth = Math.max(maxwidth,n);
           
        }
        return maxwidth;

    } 
   
   
     // check for balanced treequestion
  static  boolean isBalanced(Node root)
    {
        if(root==null)
        {
            return true;
        }
        int lh1 =height(root.left);
        int lh2 =height(root.right);
        if(!isBalanced(root.left)|| !isBalanced(root.right)) return false;
        
        
        if(Math.abs(lh1-lh2)<=1)
        {
            return true;
        }
        return false;


    }
     
   static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        else{
            return Math.max( height(root.left),height(root.right))+1;
        }

    }
    // left view  of binary tree
    public static  ArrayList<Integer>  leftview(Node root)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        if(root==null)
        {
            return arr;
        }
        while(q.isEmpty()==false)
        {
            int count  = q.size();
            for(int i =0; i<count; i++){
            Node curr = q.poll();
           if(i==0) 
           {
               arr.add(curr.data);
           }
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if( curr.right!=null)
            {
                q.add(curr.right);
            }
            }
        }
        return arr;
    }
    // right view of binary tree
    public static ArrayList<Integer> rightview(Node root)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        if(root==null)
        {
            return arr;
        }
        while(q.isEmpty()==false)
        {
            int count  = q.size();
            for(int i =0; i<count; i++){
            Node curr = q.poll();
           if(i==count-1) 
           {
               arr.add(curr.data);
           }
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if( curr.right!=null)
            {
                q.add(curr.right);
            }
            }
        }
        return arr;
    }
   
}
class Node {
    int data;
    Node right;
    Node left;

    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}
