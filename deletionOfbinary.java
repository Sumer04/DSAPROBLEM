import java.util.LinkedList;
import java.util.Queue;

public class deletionOfbinary {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.left.right = new Node(70);
        root.right = new Node(40);
        root.right.left = new Node(50);
        root.right.right = new Node(60);
        // System.out.println("befor delete");
        //  inorder(root);
        // System.out.println("after");

        // Node x = root.left;
        // deletionOfbinaryNode(root, x);
        // inorder(root);
        deletion(root,root.left.left);

    }

    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void deletionOfbinaryNode(Node root, Node x) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()) {
          root=q.peek();
            q.remove();

            if (root.left == x) {
            root.left = root.right.right;
            root.right.right = null;

            break;
            }
            if(root.left!=null)
            q.add(root.left);

            if (root.right == x) {
            root.right = root.right.right;
            root.right.right =null;
            x =root;
            break;}
             if(root.right!=null)
            q.add(root.right);
         
        }
    }
    public static void deletion(Node root,Node delete)
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (!q.isEmpty()) {
            Node curr =q.poll();
           System.out.println(curr.data);
            if (curr.left!= null) {
                if (curr.left ==  delete) {
                    curr.left = null;
                    delete =null;
                    return;
                }  
                    q.add(curr.right);
            
            }
            if (curr.right != null) {
                if (curr.right == delete) {
                    curr.right = null;
                    delete =null;



                } else 
                    q.add(curr.right);
                
            }
    }

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
