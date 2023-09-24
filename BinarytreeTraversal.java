import java.util.Stack;

import javax.imageio.stream.ImageInputStreamImpl;
public class BinarytreeTraversal {
    
        public static void main(String[] args) {
            Node root =new Node(10);
            root.left = new Node(20);
            root.right =new Node(30);
            root.right.left = new Node(40);
            root.right.right =  new Node(50);
            //inorder(root);
           // inorder1(root);
            //preorder(root);
           // preorder1(root);
           preorder2(root);
           // postorder(root);
        }
        // for inorder traversal recursive
         static void inorder(Node root)
        {
            if(root!=null)
            {
                inorder(root.left);
                System.out.println(root.data+"");
                inorder(root.right);
            }
        }
        // iterative solution for inorder traversal
        public static void inorder1(Node root)
        {
            Stack<Node> s = new Stack<Node>();
            Node curr = root;
            while(curr!=null || s.isEmpty()==false)
            {
            
                while(curr!=null)
                {
                    s.push(curr);
                    curr =curr.left;
                }
                curr =s.pop();
                System.out.println(curr.data);
                curr =curr.right;
            }
        }
        static void preorder(Node root)
        {
            if(root!=null)
            {
                System.out.println(root.data+"");
                preorder(root.left);
                preorder(root.right);
            }
        }
        // naicve
        public static void preorder1(Node root)
        {
            Stack<Node> s = new Stack<Node>();
            s.push(root);
            while(s.isEmpty()==false)
            {
                Node curr =s.pop();
                System.out.println(curr.data+"");
                if(curr.right!=null)
                {
                    s.push(curr.right);
                }
                if(curr.left!=null)
                {
                    s.push(curr.left);
                }
            }
        }
        // optimized 
        public static void preorder2(Node root)
        {
            Stack<Node> s = new Stack<>();
            Node curr =root;
            while(curr!=null || s.isEmpty()==false)
            {
                while(curr!=null)
                {
                    System.out.println(curr.data);
                    if(curr.right!=null)
                    {
                        s.push(curr.right);
                       
                    }
                    curr =curr.left;

                }
                if(s.isEmpty()==false)
                {
                    curr =s.pop();
                }
            }
        }
        static void postorder(Node root)
        {
            if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.println(root.data+"");
        }
    }
    }
    class Node {
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
    

