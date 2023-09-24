public class InsertAtbinarysearchTree {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.right = new Node(20);
        root.right.left = new Node(18);
        root.right.right = new Node(85);
        root.right.left.left = new Node(16);
       // { for serching
       // int key =1;
       // System.out.println(BinarySearchTree(root, key));
      // System.out.println(binarysearchingtree(root, key));}
      
     //{ for inserting
       
      //inorderTraversal(root);
      //System.out.println("after inserting");
     //  insertingelement(root, 30);
      // inorderTraversal(root);
    //  root =insertingelement(root, 30);
    //   inorderTraversal(root);
     //}

     insertitratviely(root, 30);
     inorderTraversal(root);


    }
    // recursive
    public static boolean BinarySearchTree(Node root,int key)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==key)
        {
            return true;
        }
        else if(root.data<key)
        {
           return BinarySearchTree(root.right, key);
        }
        else 
        {
           return BinarySearchTree(root.left, key);
        }
       // return false;

    }
    // iterative
    public static  boolean binarysearchingtree(Node root,int key)
    {
        while(root!=null)
        {
            
            if(root.data==key)
            {
               return true;
            }
            else if(root.data<key)
            {
              root =root.right;
            }
            else
            {
             root =root.left;
            }

        }
        return false;
    }
    // insert in binary searchh tree recursive solution
    public static Node insertionInBinarytree(Node root,int x)
     {
        Node temp = new Node(x);
        if(root==null)
        {
            return temp;
        }
        if(root.data==temp.data)
        {
            return root;
        }
      
        if(root.right==null)
        {
            root.right =temp;
            return temp;
        }
        if(root.left==null){
            root.left = temp;
            return temp;
        }
         if(root.data<temp.data)
        {
           
            return insertionInBinarytree(root.right, x);
        }
        else{
         
            return insertionInBinarytree(root.left, x);
        }
        
         

    }
    //recursive solution 2
    public static Node insertingelement(Node root,int x)
    {
     // Node temp = new Node(x);
       if(root==null)
       {
        return new Node(x);
       }
       else if(root.data<x)
       {
        root.right = insertingelement(root.right, x);
       }
       else if(root.data>x)
       {
        root.left = insertingelement(root.left, x);
       }
       return root;
    }
    public static void inorderTraversal(Node root)
    {
        if(root!=null)
        {
            inorderTraversal(root.left);
            System.out.println(root.data);
            inorderTraversal(root.right);

        }
    }
    public static Node insertitratviely(Node root ,int x)
    {
        Node temp = new Node(x);
        Node parent =null;
        Node curr = root;
        while(curr!=null)
        {
            parent = curr;
            if(curr.data>x)
            {
                curr =curr.left;
            }
           else if(curr.data<x)
            {
                curr = curr.right;
            }
            else{
                return root;
            }
        }
        if(parent==null )
        {
            return temp;
        }
        if(parent.data<x)
        {
            parent.right =temp;
        }
        else{
            parent.left =temp;
        }
        return root;
    }
    // deletion  in binary tree
    

  

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
