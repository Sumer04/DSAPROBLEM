import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class levelOrdertraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
         root.left = new Node(20);
        // root.left.left =new Node(4);
        // root.left.right = new Node(7);
        root.right = new Node(30);
        root.right.left = new Node(40);
         root.right.right = new Node(50);
        // int h = height(root);
        // for (int i = 1; i <= h; i++) {
        //     printlevel(root, i);
        // }
        // // printlevel(root,i);
        // }
         levelorder(root);
        // countElement(root);
        // int max =0;
        // countElement(root);
        /// System.out.println(maxvalue(root));
       // levelorder(root);
       // System.out.println(countbyrecursion(root));
    }

    // efficient approach
    public static void levelorder(Node root)
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while(q.isEmpty()==false)
        {
            Node curr = q.poll();
            System.out.println(curr.data);
            if(curr.left!=null)
            {
                q.add(curr.left);
            }
            if(curr.right!=null)
            {
                q.add(curr.right);
            }
        }
    }

    

    // first we calculate height
    static int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right) + 1);
        }
    }

    // approach naive
    public static void printlevel(Node root, int i) {
        if (root == null) {
            return;
        }
        if (i == 1) {
            System.out.println(root.data);
        }
        if (i > 1) {
            printlevel(root.left, i - 1);
            printlevel(root.right, i - 1);
        }

    }

    // iterative
    public static void countElement(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int count = 0;
        while (q.isEmpty() == false) {
            Node curr = q.poll();
            count++;

            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
        System.out.println(count);
    }

    public static int countbyrecursion(Node root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + (countbyrecursion(root.left) + countbyrecursion(root.right));
        }
    }

    // maximum of binary search
    public static int maxvalue(Node root) {
        if (root == null) {
            return 0;
        }
        int max = Math.max(maxvalue(root.left), maxvalue(root.right));
        if (root.data > max) {
            return root.data;
        } else {
            return max;
        }
        // by level order
        // Queue<Node>q =new LinkedList<>();
        // q.add(root);
        // int result =0;

        // while(q.isEmpty()==false)
        // {
        // Node curr =q.poll();
        // if(curr.data>result){
        // result =curr.data;
        // }

        // System.out.println(curr.data);
        // if(curr.left!=null)
        // {
        // q.add(curr.left);
        // }
        // if(curr.right!=null)
        // {
        // q.add(curr.right);
        // }
        // }
        // System.out.println(result);

    }

}

class Node {
    int data;
    Node left;
    Node right;

    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}
