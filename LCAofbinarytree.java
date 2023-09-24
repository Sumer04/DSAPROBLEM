import java.util.LinkedList;
import java.util.Queue;

public class LCAofbinarytree {
    public static void main(String[] args) {
//         Node root = new Node(5);
//         root.left = new Node(2);
//         root.left.left = new Node(4);
//        root.left.right =new Node(1);
//         root.left.left.right.left =new Node(7);
//         root.left.left.right.right =new Node(6);
//         root.right = new Node(3);
//         root.right.left = new Node(18);
//        root.right.right = new Node(85);
//        root.right.left.left = new Node(16);
     
//     int n1 = 1;int n2 = 3;
//q 1  lca(root, n1, n2);
//  q 2 System.out.println(diameter(root));
// q 3 mirror(root);
// q 3 inorder(root);

// check subtree
        Node T = new Node(26);
        T.left = new Node(10);
        T.left.right = new Node(6);
        T.left.left = new Node(4);
        T.left.left.right = new Node(30);
        T.right = new Node(3);
        T.right.right = new Node(3);
        Node S = new Node(10);
        S.left = new Node(4);
        S.left.right = new Node(30);
        S.right = new Node(6);
      
        System.out.println(checksubtree(T, S));

    }

    public static Node lca(Node root, int n1, int n2) {

        // recursive solution
        if (root == null) {

            return null;

        }

        if (root.data == n1 || root.data == n2) {

            return root;

        }

        Node leftsearch = lca(root.left, n1, n2);

        Node rightsearch = lca(root.right, n1, n2);

        if (leftsearch == null) {

            return rightsearch;

        }

        if (rightsearch == null) {

            return leftsearch;

        }

        return root;

    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }

    // diameter of a binary tree
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int case1 = diameter(root.left);
        int case2 = diameter(root.right);
        int case3 = height(root.left) + height(root.right) + 1;
        return Math.max(case3, Math.max(case1, case2));
    }

    // mirror of a binary tree
    public static void mirror(Node root) {
        Node temp;
        if (root == null) {
            return;
        } else {
            mirror(root.left);
            mirror(root.right);

            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }

    }

    // check if subtree
    public static boolean checksubtree(Node T, Node S) {
         if(T==null)
         {
            return false;
         }
         if(S==null)
         {
            return true;
         }
         if(areidentical(T, S))
         {
            return true;
         }
         return checksubtree(T.left, S) || checksubtree(T.right, S);


    }
    public static boolean areidentical(Node T,Node S)
    {
        if(T==null && S==null)
        {
            return true;
        }
        if(T==null || S==null)
        {
            return false;
        }
        return T.data ==S.data && areidentical(T.left, S.left)  && areidentical(T.right, S.right);
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
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