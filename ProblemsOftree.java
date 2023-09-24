
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class ProblemsOftree {
    public static void main(String[] args) {
      Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
        // System.out.println(identical(root1, root2));
       // System.out.println(sumOFparant(root1));
       levelorderSpiral(root);
    }

    public static boolean identical(Node root1, Node root2) {
        Queue<Node> q = new LinkedList<Node>();
        Queue<Node> q1 = new LinkedList<Node>();
        q.add(root1);
        q1.add(root2);
        while (!q.isEmpty() && q1.isEmpty() == false) {

            Node curr1 = q.poll();
            Node curr2 = q1.poll();
            if (curr1.data != curr2.data) {
                return false;
            }
            if (curr1.left == null && curr2.left != null) {
                return false;
            }
            if (curr1.left != null && curr2.left == null) {
                return false;
            }

            if (curr1.right == null && curr2.right != null) {
                return false;
            }
            if (curr1.right != null && curr2.right == null) {
                return false;
            }
            if (curr1.left != null && curr2.left != null) {
                q.add(curr1.left);
                q1.add(curr2.left);
            }
            if (curr1.right != null && curr2.right != null) {
                q.add(curr1.right);
                q1.add(curr2.right);
            }

        }
        return true;

    }

    // q-2
    public static boolean sumOFparant(Node root1) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root1);
        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr.left != null && curr.right != null) {
                int sum = curr.left.data + curr.right.data;
                if (sum != curr.data) {
                    return false;
                }
            }
            if (curr.left != null && curr.right == null) {
                int sum = curr.left.data ;
                if (sum != curr.data) {
                    return false;
                }
            

            }
            if (curr.left == null && curr.right != null) {
                int sum =  curr.right.data;
                if (sum != curr.data) {
                    return false;
                }
            }
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }

        }

        return true;

    }
   // q-3 level order traversal line by line
   // arraylis and normal solution
  // public static ArrayList<ArrayList<Integer>> levelOrder(Node root){
    public static void levelorder(Node root){
   // ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(); 
    Queue<Node> q = new LinkedList<>();
    Queue<Node> q1 = new LinkedList<>();
    
    //ArrayList<Integer> list = new ArrayList<Integer>(); 
    q.add(root);


    while (q.isEmpty() == false || q1.isEmpty()==false) {
       while(q.isEmpty()==false)
       {
        Node curr = q.poll();
        System.out.print(curr.data+"");
     // list.add(curr.data);
         if (curr.left != null) {
            q1.add(curr.left);

           
        }
        if(curr.left!=null && curr.right==null)
        {
            System.out.println("");
           //list.add("\n");
        }
        if (curr.right != null) {
            q1.add(curr.right);
           System.out.println("");
        }
     
       
    }
    while(q1.isEmpty()==false)
    {
        Node curr = q1.poll();
        System.out.print(curr.data+"");
      // list.add(curr.data);
         if (curr.left != null) {
            q.add(curr.left);
            
        }
        if (curr.right != null) {
            q.add(curr.right);
           
        }  
    }
 System.out.println("");
}
//return result;

}
public static void levelorderSpiral(Node root){
Stack<Node> s = new Stack<>();
Stack<Node> s1 = new Stack<>();
if(root==null)
{
    return;
}
s.push(root);
while(s.isEmpty()==false || s1.isEmpty()==false)
{
          while(s.isEmpty()==false)
          {

          Node curr = s.pop();
           System.out.println(curr.data);
           if(curr.right!=null)
           {
            s1.push(curr.right);
           }
           if(curr.left!=null)
           {
            s1.push(curr.left);
           }
          }
          while(s1.isEmpty()==false)
          {
            Node curr =s.pop();
            System.out.println(curr.data);
            if(curr.left!=null)
            {
                s.push(curr.left);
            }
            if(curr.right!=null)
            {
                s.push(curr.right);
            }
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
