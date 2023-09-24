public class maximumdifferenceofnodeandancestor{
   static   int res=Integer.MIN_VALUE; 
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(1);
        System.out.println(maxDiff(root));
    }
  
     static int  maxDiff(Node root)
    {
        diff(root);
       return res;
        
    }
      static int diff(Node root)
    {
        if(root==null){return Integer.MAX_VALUE;}
        int l=diff(root.left);
        int r=diff(root.right);
        int sum=Math.max(root.data-l,root.data-r);
        res=Math.max(res,sum);
        return Math.min(root.data,Math.min(l,r));
        
        
    }
}
class Node
{
    int data;
    Node left;
    Node right;
    Node(int x)
    {
        data=x;
        left=null;
        right =null;
    }
}