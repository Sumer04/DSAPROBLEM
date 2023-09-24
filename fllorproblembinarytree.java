public class fllorproblembinarytree {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(5);
       root.left.right = new Node(7);
        root.right = new Node(20);
         root.right.left = new Node(18);
        root.right.right = new Node(85);
        root.right.left.left = new Node(16);
   // System.out.println(floor(root, 12).data);
    System.out.println(ceillingofbinary(root, 17).data);
    }
    // floor of a  bst problem
    public static Node floor(Node root,int x)
    {
        Node res = null;
        while(root!=null)
        {
           
            if(root.data==x)
            {
                return root;
            }
            else if(root.data>x)
            {
                root = root.left;
            }
            else{
                res = root;
                root = root.right;

            }

        }
        return res;
    }
    public static Node ceillingofbinary(Node root,int x)
    {
        Node res = null;
        while(root!=null)
        {
           
            if(root.data==x)
            {
                return root;
            }
            else if(root.data<x)
            {
                root = root.right;
            }
            else{
                res = root;
                root = root.left;

            }

        }
        return res;
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
