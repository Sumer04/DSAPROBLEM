import java.util.LinkedList;
import java.util.Queue;

public class foldable {
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(7);
		root.right = new Node(15);
		root.left.left = new Node(4);
		 root.right.right = new Node(5);
		System.out.println(foldable(root));
	}

	public static boolean foldable(Node root) {
		Queue<Node> q1 = new LinkedList<>();
		Queue<Node> q2= new LinkedList<>();
		if(root.left!=null)
		{
			q1.add(root.left);
		}
		if(root.right!=null)
		{
			q2.add(root.right);
		}
		if(q1.size()!=q2.size())
		{
			return false;
		}
		while (q1.size()!=0 && q2.size()!=0) {
		   int q1size = q1.size();
		   int q2size  = q2.size();
		   if(q1size!=q2size)
		   {
			return false;
		   }
		   for(int i=0; i<q1size; i++)
		   {
			Node curr1 = q1.poll();
			Node curr2 = q2.poll();
             boolean a1[] =  new boolean[2];
			 boolean b1[] =  new boolean[2];
			if(curr1.left!=null)
			{
                 q1.add(curr1.left);
				 a1[0] =true;
			}
			if(curr1.right!=null)
			{
				q1.add(curr1.right);
				a1[1] =true;
			}
			if(curr2.right!=null)
			{
				q2.add(curr2.right);
				b1[0] = true;
			}
			if(curr2.left!=null)
			{
				q2.add(curr2.left);
				b1[1] = true;
			}
			if(a1[0]!=b1[0]) return false;
			if(a1[1]!=b1[1]) return false;
		   }
		

		

		}

		return true;
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
