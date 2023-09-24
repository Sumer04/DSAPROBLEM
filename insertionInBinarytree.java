import java.util.Queue;
import java.util.LinkedList;

public class insertionInBinarytree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.left.left = new Node(30);
        root.right = new Node(40);
        root.right.left = new Node(50);
        root.right.right = new Node(60);
      
       System.out.println("before insertion");
       inorder(root);
        insert(root, 12);
        System.out.println("after insertion");
        inorder(root);

    }
    static void inorder(Node root)
	{
		if (root == null)
			return;

		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}

 
    static void insert(Node root, int key) 
    { 
        Queue<Node> q = new LinkedList<Node>(); 
        q.add(root); 
     while (!q.isEmpty()) { 
           
             root=q.peek();
             q.remove();

    
            if (root.left == null) { 
                root.left = new Node(key); 
                break; 
            } else
                q.add(root.left); 
    
            if (root.right == null) { 
                root.right = new Node(key); 
                break; 
            } else
                q.add(root.right); 
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