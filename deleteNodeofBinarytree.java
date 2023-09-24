public class deleteNodeofBinarytree {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
       root.left.right = new Node(7);
        root.right = new Node(20);
         root.right.left = new Node(18);
        root.right.right = new Node(85);
        root.right.left.left = new Node(16);
        deleteNode(root,7);
       inorder(root);
    }
    public static void inorder(Node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);

        }
    }
   public static Node deleteNode(Node root,int x)
   {
    if(root==null)
    {
        return null;
    }
    if(root.data<x)
    {
        root.right =  deleteNode(root.right,x);
    }
   else if(root.data>x)
    {
        root.left = deleteNode(root.left,x);
    }
    else{
        if(root.left==null)
        {
            return root.right;
        }
        if(root.right==null)
        {
            return root.left;
        }
        else{
            Node succ =findSuccesor(root);
            root.data = succ.data;
            root.right = deleteNode(root.right,succ.data);
        }
    }
    return root;
   }
   public static Node findSuccesor(Node root)
   {
    Node curr = root.right;
    while(curr!=null && curr.left!=null)
    {
        curr =curr.left;
    }
    return curr;


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
